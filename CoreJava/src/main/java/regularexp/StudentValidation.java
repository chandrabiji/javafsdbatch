package regularexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id ?");
		String id = sc.next();
		while(!Pattern.matches("\\d{4}", id))
		{
			System.err.println("Please enter student Id must be 4 digits only");
			id = sc.next();
		}
		int sid = Integer.parseInt(id);//we are converted String to integer using wrapper class
		System.out.println("Enter Student Name ?");
		String name = sc.next();
		while(!Pattern.matches("^[A-Z].*", name)) {
			System.err.println("Please enter Student name start with Uppercase letter");
			name = sc.next();
		}
		System.out.println("Enter Student Mobile Number ?");
		String mno = sc.next();
		while(!Pattern.matches("\\d{10}", mno)) {
			System.err.println("Please enter Student Mobile number 10 digits must");
			mno=sc.next();
		}
		long mobile = Long.parseLong(mno);
		System.out.println("Enter Student Email Id ?");
		String email = sc.next();
		while(!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\r\n"
				, email)) {
			System.err.println("Please enter valid email id ");
			email = sc.next();
		}
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+name);
		System.out.println("Student Mobile No: "+mobile);
		System.out.println("Student Email Id: "+email);

	}

}
