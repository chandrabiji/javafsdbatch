package p1;

public class A {
	//Instance Variable
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	
	public static void main(String[] args) {
		//Create a instance for accessing instance variables
		A obj = new A();//instance or object
		System.out.println("A = "+obj.a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);

	}

}
