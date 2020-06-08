package com.tacticalpeople.shop.dao;

import java.util.List;

import org.hibernate.Session;
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
	public Long save(Product product)
	{
		sessionFactory.getCurrentSession().save(product);
		return product.getId();
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
	public void updateProduct(Long id, Product product) 
	{
		Session session = sessionFactory.getCurrentSession();
		Product productToUpdate = session.byId(Product.class).load(id);
		productToUpdate.setName(product.getName());
		productToUpdate.setCategory(product.getCategory());
		productToUpdate.setDescription(product.getDescription());
		productToUpdate.setPrice(product.getPrice());
		session.flush();
	}

	@Override
	public void deleteProduct(Long id) 
	{
		Session session = sessionFactory.getCurrentSession();
		Product productToDelete = session.byId(Product.class).load(id);
		session.delete(productToDelete);
	}
	
	
}
