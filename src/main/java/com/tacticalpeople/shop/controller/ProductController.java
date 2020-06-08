package com.tacticalpeople.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Long id)
	{
		Product product = productService.getProduct(id);
		return ResponseEntity.ok().body(product);
	}
	
	@PostMapping("/products")
	public ResponseEntity<?> saveProduct(@RequestBody Product product)
	{
		Long id = productService.save(product);
		return ResponseEntity.ok().body("Product saved with id: " + id);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable("id") Long id)
	{
		productService.updateProduct(id, product);
		return ResponseEntity.ok().body("Product updated with id: " + id);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id)
	{
		productService.deleteProduct(id);
		return ResponseEntity.ok().body("Product deleted with id: " + id);
	}
}
