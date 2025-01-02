package arrays;

import java.util.Scanner;

class Student{
	//instance variables
	public int sid;
	public String sname;
	public int marks;
	//Parameterized Constructor
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	
}
public class ObjectArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Array Size ?");
		int size = sc.nextInt();
		Student[] students = new Student[size];
		System.out.println("Enter Student number,name and marks ?");
		for(int i=0;i<size;++i) {
			int no = sc.nextInt();
			String name = sc.next();
			int marks = sc.nextInt();
			students[i]=new Student(no,name,marks);
		}
		System.out.println("Student Array Elements are:");
		for(Student s:students) {
			System.out.println(s.sid+"\t"+s.sname+"\t"+s.marks);
		}
	}

}
