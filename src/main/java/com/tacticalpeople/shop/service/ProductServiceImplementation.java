package com.tacticalpeople.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tacticalpeople.shop.dao.ProductDAO;
import com.tacticalpeople.shop.model.Product;

@Service
@Transactional(readOnly = true)
public class ProductServiceImplementation implements ProductService
{
	@Autowired
	private ProductDAO productDAO;

	@Override
	@Transactional
	public Long save(Product product) 
	{
		return productDAO.save(product);
	}

	@Override
	@Transactional
	public Product getProduct(Long id) 
	{
		return productDAO.getProduct(id);
	}

	@Override
	@Transactional
	public List<Product> getProducts() 
	{
		return productDAO.getProducts();
	}

	@Override
	@Transactional
	public void updateProduct(Long id, Product product) 
	{
		productDAO.updateProduct(id, product);
	}

	@Override
	@Transactional
	public void deleteProduct(Long id) 
	{
		productDAO.deleteProduct(id);
	}
	
}
