package oops;
//class definition
class Car{
	
	String color;
	String model;
	
	void drive() {
		System.out.println("Driving "+model);
	}
	
}
public class ClassAndObject {

	public static void main(String[] args) {
		// Creating an instance
		Car bmw = new Car();
		bmw.color="Red";
		bmw.model="Tesla Model 3";
		bmw.drive();

	}

}
