package arrays;

import java.util.Scanner;

public class SingleDimDynamicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ?");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements are ?");
		for(int i=0;i<size;++i) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int k:arr) {
			System.out.println(k);
		}

	}

}
