package flowcontroller;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your day number ?");
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("Monday");
			//break;
		case 2:
			System.out.println("Tuesday");
			//break;
		case 3:
			System.out.println("Wenesday");
			break;
		default:
			System.out.println("Other day");

		}
	}

}
