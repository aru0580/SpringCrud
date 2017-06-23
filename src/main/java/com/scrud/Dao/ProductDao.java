package com.scrud.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.scrud.model.Product;

public interface ProductDao {
	List<Product> getProductAllList();
	Product getProductById(int id);
	void addProduct(Product product);
	void editProduct(Product product);
	void deleteProduct(Product product);
}
