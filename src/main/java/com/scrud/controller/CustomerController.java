package com.scrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scrud.model.Authorities;
import com.scrud.model.Customer;
import com.scrud.service.CustomerService;

@Controller
@Configuration
@ComponentScan("com.scrud.*")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/register")
	public String addProduct(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "register";
	}
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("customer") Customer customer,Model model)
	{
		
		/*List<Customer> customers=customerService.getAllCustomers();
		  for (int i=0; i< customers.size(); i++) {
	            if(customer.getCustomerEmail().equals(customers.get(i).getCustomerEmail())) 
	            		{
	                model.addAttribute("emailMsg", "Email already exists");

	                return "/register";
	            }

	            if(customer.getUsername().equals(customers.get(i).getUsername())) {
	                model.addAttribute("usernameMsg", "Username already exists");

	                return "/register";
	            }
	        }*/
		Authorities authorities=new Authorities();
		authorities.setUsername(customer.getUsername());
		authorities.setAuthority("ROLE_USER");
		customer.setEnabled(true);
	    customerService.addCustomer(customer);
	    customerService.addAuthority(authorities);
	    return "success";	
	}
	
}
