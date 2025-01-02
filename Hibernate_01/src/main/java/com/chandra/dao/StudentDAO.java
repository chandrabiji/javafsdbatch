//package com.chandra.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.chandra.model.Student;
//
//public class StudentDAO {
//
//	private SessionFactory factory;
//
//	public StudentDAO() {
//		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
//	}
//	
//	//Create student
//	public void saveStudent(Student student) {
//		Session session =factory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			session.save(student);
//			session.getTransaction().commit();
//		}finally {
//			factory.close();
//		}
//		System.out.println("Successfully Student created...");
//	}
//	//Read Student
//	public Student getStudent(int id) {
//		Session session =factory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			Student student = session.get(Student.class, id);
//			session.getTransaction().commit();
//			return student;
//		}finally {
//			factory.close();
//		}
//	}
//	//update Student
//	public void updateStudent(Student updateStudent) {
//		Session session =factory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			session.update(updateStudent);
//			session.getTransaction().commit();
//			
//		}finally {
//			factory.close();
//		}
//		System.out.println("Successfully Student Updated....");
//	}
//	
//	//delete Student
//	public void deleteStudent(int id) {
//		Session session =factory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			Student student = session.get(Student.class, id);
//			session.delete(student);
//			session.getTransaction().commit();
//			
//		}finally {
//			factory.close();
//		}
//		System.out.println("Successfully Student deleted : "+id);
//	}
//	
//	//List all Students
//	public List<Student> getAllStudents(){
//		Session session =factory.getCurrentSession();
//		try {
//			session.beginTransaction();
//			List<Student> students = session.createQuery("from Student",Student.class).getResultList();
//			session.getTransaction().commit();
//			return students;
//		}finally {
//			factory.close();
//		}
//	}
//}

package com.chandra.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.chandra.model.Student;

public class StudentDAO {

    private static SessionFactory factory;

    // Initialize the SessionFactory once
    static {
        factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
    }

    // Create a student
    public void saveStudent(Student student) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            System.out.println("Successfully Student created...");
        }
    }

    // Read student
    public Student getStudent(int id) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }

    // Update student
    public void updateStudent(Student updateStudent) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            session.update(updateStudent);
            session.getTransaction().commit();
            System.out.println("Successfully Student updated...");
        }
    }

    // Delete student
    public void deleteStudent(int id) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            if (student != null) {
                session.delete(student);
                session.getTransaction().commit();
                System.out.println("Successfully Student deleted: " + id);
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        }
    }

    // List all students
    public List<Student> getAllStudents() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            List<Student> students = session.createQuery("from Student", Student.class).getResultList();
            session.getTransaction().commit();
            return students;
        }
    }

    // Close the factory during application shutdown
    public static void closeFactory() {
        if (factory != null) {
            factory.close();
        }
    }
}

