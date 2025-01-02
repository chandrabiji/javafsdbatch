package flowcontroller;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many numbers do you want?");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n) {
			System.out.println(i);
			sum +=i;//sum = sum +i;
			i++;
		}
		System.out.println("Sum of numbers = "+sum);

	}

}
