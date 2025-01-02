package oops;
class Engine{
	void start() {
		System.out.println("Engine Starts");
	}
}
class Carr{
	
	private Engine engine;
	
	Carr(){
		engine = new Engine();
	}
	
	void drive() {
		engine.start();
		System.out.println("Car is driving...");
	}
	
}
public class ompositionExample {

	public static void main(String[] args) {
		Carr car = new Carr();
		car.drive();

	}

}
