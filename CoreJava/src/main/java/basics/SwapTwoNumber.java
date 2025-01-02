package basics;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);	
      System.out.println("Enter A value ?");
      int a = sc.nextInt();
      System.out.println("Enter B value ?");
      int b = sc.nextInt();
      System.out.println("A = "+a+"\t"+"B = "+b);
      a = a+b;//a = 5+10=15
      b = a-b;//b = 15-10=5
      a = a-b;//a = 15-5=10
      System.out.println("A = "+a+"\t"+"B = "+b);

	}

}
