package com.chandra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chandra.model.Student;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student student = s.load(Student.class, new Integer(1));
		System.out.println("Student Id : "+student.getId());
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student Marks : "+student.getMarks());
		tx.commit();
		s.close();
		sf.close();
		
		

	}

}
