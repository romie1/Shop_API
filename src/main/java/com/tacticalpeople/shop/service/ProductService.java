package com.tacticalpeople.shop.service;

import java.util.List;

import com.tacticalpeople.shop.model.Product;

public interface ProductService 
{
	//Save a product
	Long save(Product product);
	
	//Get a product
	Product getProduct(Long id);
	
	//Get a list of products
	List<Product> getProducts();
	
	//Update a product
	void updateProduct(Long id, Product product);
	
	//Delete a product
	void deleteProduct(Long id);
	
}
