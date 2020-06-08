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
	public Long save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Product> getProducts() 
	{
		return productDAO.getProducts();
	}

	@Override
	public void updateProduct(Long id, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
