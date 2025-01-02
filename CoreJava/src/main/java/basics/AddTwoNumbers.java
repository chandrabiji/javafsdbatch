package basics;

public class AddTwoNumbers {

	//Instance Variables
	int d = 40;
	//Static Variables
	static int e = 50;
	public static void main(String[] args) {
		AddTwoNumbers obj = new AddTwoNumbers(); // this is nothing but instance or object
		// Local Variable
		int a = 10,b = 20;
		int c = a+b+obj.d;
		System.out.println("Sum of two numbers = "+c);
		System.out.println("Static Variable E = "+e);
		obj.msg();
		obj.xyz();

	}
	public void msg() {
		System.out.println("D = "+d);
		System.out.println("Static Variable E = "+e);
	}
	public void xyz() {
		System.out.println("D = "+d);
		System.out.println("Static Variable E = "+e);
	}

}
