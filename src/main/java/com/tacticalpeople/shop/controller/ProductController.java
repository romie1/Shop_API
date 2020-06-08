package com.tacticalpeople.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tacticalpeople.shop.model.Product;
import com.tacticalpeople.shop.service.ProductService;



@RestController
@RequestMapping("/api")
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts()
	{
		List<Product> products = productService.getProducts();
		return ResponseEntity.ok().body(products);
	}
}
