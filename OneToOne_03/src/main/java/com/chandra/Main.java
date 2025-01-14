package com.chandra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.model.Address;
import com.chandra.model.Person;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Address address= new Address("Main Street", "Secundrabad");
		Person person = new Person("Chandra",address);
		address.setPerson(person);
		s.save(person);
		
		tx.commit();
		s.close();
		sf.close();

	}

}
