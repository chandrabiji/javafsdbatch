package com.chandra.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		//Create a Department
		Department department = new Department();
		department.setName("IT");
		
		//Create a Employees
		
		Employee e1 = new Employee();
		e1.setName("Sekhar");
		e1.setDepartment(department);
		
		Employee e2 = new Employee();
		e2.setName("Yamini");
		e2.setDepartment(department);

		Employee e3 = new Employee();
		e3.setName("Deepthi");
		e3.setDepartment(department);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		department.setEmployees(employees);
		//Save the department (cascade will save employees)
		s.save(department);
		tx.commit();
		s.close();
		sf.close();
		
		
		
		

	}

}
