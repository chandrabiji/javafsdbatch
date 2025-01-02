package operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A & B values ?");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("sum(+) = "+(a+b));
		System.out.println("Difference(-) = "+(a-b));
		System.out.println("Product(*) = "+(a*b));
		System.out.println("Quotient(/) = "+(a/b));
		System.out.println("Remainder(%) = "+(a%b));

	}

}
