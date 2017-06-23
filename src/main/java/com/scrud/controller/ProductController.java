package com.scrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scrud.model.Product;
import com.scrud.service.ProductService;

@Controller
@Configuration
@ComponentScan("com.scrud.*")

public class ProductController {
	@Autowired
	ProductService productService;
	
	/*@RequestMapping("/")
	public String home()
	{
		return "index";
	}*/
	@RequestMapping("/admin/*/addproducts")
	public String addProduct(Model model)
	{
		model.addAttribute("product",new Product());
		return "addProduct";
	}
	@RequestMapping("/admin/addproducts")
	public String addProduct1(Model model)
	{
		model.addAttribute("product",new Product());
		return "addProduct";
	}
	@RequestMapping(value="/admin/product/add", method = RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute("product") Product p)
	{
	    productService.addProduct(p);
	    return new ModelAndView("redirect:/admin/viewall");
		
	}
	@RequestMapping(value="/admin/viewall")
	public String getProductAllList(Model model)
	{
		List<Product> products = productService.getProductAllList();
        model.addAttribute("products",products); 
        return "viewProduct";
	}
	@RequestMapping(value="/admin/edit/{productId}")
	public ModelAndView editProduct(@PathVariable int productId)
	{
		Product product=productService.getProductById(productId);
		
		ModelAndView model=new ModelAndView("editAction","product",product);
		return model;
	}
	@RequestMapping(value="/admin/edit/editAction",method = RequestMethod.POST)
	public ModelAndView editAction(@ModelAttribute("product") Product product)
	{
		productService.editProduct(product);
		 return new ModelAndView("redirect:/viewall");
	}
	@RequestMapping(value="/admin/delete/{productId}")
	public ModelAndView deleteAction(@PathVariable int productId)
	{
		Product product=productService.getProductById(productId);
		productService.deleteProduct(product);
		 return new ModelAndView("redirect:/admin/viewall");
	}
	@RequestMapping(value="/viewall")
	public String getProductAllList1(Model model)
	{
		List<Product> products = productService.getProductAllList();
        model.addAttribute("products",products); 
        return "view";
	}
}
