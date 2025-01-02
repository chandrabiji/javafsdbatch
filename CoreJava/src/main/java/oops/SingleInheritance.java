package oops;

class Parent{
	void display() {
		System.out.println("This is the Parent class");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("This is the Child class");
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child child = new Child();
		child.display();
		child.show();

	}

}
