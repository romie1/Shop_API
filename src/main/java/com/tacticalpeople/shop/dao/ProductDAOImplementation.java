package com.tacticalpeople.shop.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tacticalpeople.shop.model.Product;

@Repository
public class ProductDAOImplementation implements ProductDAO
{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(Long id)
	{
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Override
	public List<Product> getProducts()
	{
		List<Product> products = sessionFactory.getCurrentSession().createQuery("from Product").list();
		return products;
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
