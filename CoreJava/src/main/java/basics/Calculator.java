package basics;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Calculator {
	//instance method
	public int add(int a, int b) {
		return a+b;
	}
	//static method
	public static int multiply(int a, int b) {
		return a*b;
	}
	//void method
	void printMessage() {
		System.out.println("This is void method message");
	}
	//return method
	int square(int x) {
		return x*x;
	}
	//Parameterized Method
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	//Method Overloading

	public static void main(String[] args) {
		// if you want to access add method first create instance 
		Calculator calculator = new Calculator();
		int sum = calculator.add(10, 20);
		System.out.println("Sum = "+sum);
		int result = multiply(10, 5);
		System.out.println("Multiply value = "+result);
		calculator.printMessage();
		int squared = calculator.square(5);
		System.out.println("Squared value = "+squared);
		calculator.sayHello("Chandra");

	}

}
