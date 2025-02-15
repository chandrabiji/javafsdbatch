package com.chandra.model;

import java.util.List;

import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		//Using Native SQL
//		String sql = "SELECT * FROM CUSTOMER";
//		NativeQuery<Customer> query = (NativeQuery<Customer>) s.createNamedQuery(sql,Customer.class);
//		List<Customer> customers = query.getResultList();
//		for(Customer c:customers) {
//			System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAddress());
//		}
		
		tx.commit();
		s.close();
		sf.close();

	}

}
