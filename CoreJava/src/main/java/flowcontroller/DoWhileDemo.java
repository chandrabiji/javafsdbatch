package flowcontroller;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ?");
		int n = sc.nextInt();
		int i = 1,sum=0;
		do {
			System.out.println(i);
			sum+=i;
			i++;
		}while(i<=n);
		System.out.println("Sum of vlaues = "+sum);

	}

}
