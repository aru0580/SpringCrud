package com.scrud.service;

import java.util.List;

import com.scrud.model.Product;

public interface ProductService {
	List<Product> getProductAllList();
	Product getProductById(int id);
		void addProduct(Product product);
		void editProduct(Product product);
		void deleteProduct(Product product);
}
