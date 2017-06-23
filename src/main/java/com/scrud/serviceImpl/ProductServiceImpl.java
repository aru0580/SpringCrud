package com.scrud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrud.Dao.ProductDao;
import com.scrud.model.Product;
import com.scrud.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
    private ProductDao productDao;

	public void addProduct(Product product)
	{
	     productDao.addProduct(product);
	}
	public List<Product> getProductAllList()
	{
		return productDao.getProductAllList();
	}
	public void editProduct(Product product)
	{
		productDao.editProduct(product);
	}
	public Product getProductById(int id)
	{
		return productDao.getProductById(id);
	}
	public void deleteProduct(Product product)
	{
		productDao.deleteProduct(product);
	}
}
