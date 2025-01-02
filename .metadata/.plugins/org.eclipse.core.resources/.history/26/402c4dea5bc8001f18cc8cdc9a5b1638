package com.chandra.model;

import java.util.List;

import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		CriteriaDelete<Customer> criteriaDelete = s.getCriteriaBuilder().createCriteriaDelete(Customer.class);

		Root<Customer> from = criteriaDelete.from(Customer.class);
		criteriaDelete.where(s.getCriteriaBuilder().equal(from.get("id"), 2));
		s.createQuery(criteriaDelete).executeUpdate();
		tx.commit();
		s.close();
		sf.close();

	}

}
