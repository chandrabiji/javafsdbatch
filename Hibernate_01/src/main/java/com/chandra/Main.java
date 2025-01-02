package com.chandra;

import com.chandra.dao.StudentDAO;
import com.chandra.model.Student;

public class Main {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		
//		//Create Student
//		Student s1 = new Student();
//		s1.setName("Sekhar");
//		s1.setMarks(95);
//		
//		Student s2= new Student();
//		s2.setName("Charan");
//		s2.setMarks(90);
//		
//		dao.saveStudent(s1);
//        dao.saveStudent(s2);
        
        //Read Student
        Student student = dao.getStudent(1);
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student Marks : "+student.getMarks());
//        
        //Update Student
        student.setName("Chandra Sekhar");
        dao.updateStudent(student);
//        
        //delete Student
        dao.deleteStudent(2);
	}

}
