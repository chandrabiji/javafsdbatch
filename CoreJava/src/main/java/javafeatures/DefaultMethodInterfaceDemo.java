package javafeatures;

interface Vehicle{
	public void color();//abstract method
	default void start() {
		System.out.println("Vehicle is starting......");
	}
	static void stop() {
		System.out.println("Vechicle is stopped....");
	}
	
}
public class DefaultMethodInterfaceDemo implements Vehicle{
	
	public void color() {
		System.out.println("Red color");
	}

	public static void main(String[] args) {
		Vehicle car = new DefaultMethodInterfaceDemo();
		car.color();
		car.start();
		Vehicle.stop();

	}

}
