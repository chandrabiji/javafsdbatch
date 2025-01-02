package com.chandra.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		Product product = new Product();
		product.setName("Laptop");
		product.setPrice(800.00);
		
		s.save(product);
		s.beginTransaction().commit();
		
		s = sf.getCurrentSession();
		s.beginTransaction();
		Product retrieveProduct = s.get(Product.class, product.getId());
		s.beginTransaction().commit();
		
		Product cacheProduct = s.get(Product.class, product.getId());
		s.beginTransaction().commit();

	}

}
