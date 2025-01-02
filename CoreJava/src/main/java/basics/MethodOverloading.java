package basics;

public class MethodOverloading {
	
	void show(int number) {
		System.out.println("Number : "+number);
	}
	
	void show(String text) {
		System.out.println("Text : "+text);
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();//instance or object
		mo.show(5);
		mo.show("Hello");

	}

}
