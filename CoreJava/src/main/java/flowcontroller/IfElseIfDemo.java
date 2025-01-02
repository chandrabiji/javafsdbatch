package flowcontroller;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Score ?");
		int score = sc.nextInt();
		if(score>=90) {
			System.out.println("Grade A");
		}else if(score>=80) {
			System.out.println("Grade B");
		}else {
			System.out.println("Grade C");
		}

	}

}
