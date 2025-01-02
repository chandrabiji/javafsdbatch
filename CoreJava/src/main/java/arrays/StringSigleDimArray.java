package arrays;

import java.util.Scanner;

public class StringSigleDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String array size ?");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter String Array Elements ?");
		for(int i=0;i<size;++i) {
			names[i]=sc.next();
		}
		System.out.println("String array elements are:");
		for(String name:names) {
			System.out.println(name);
		}

	}

}
