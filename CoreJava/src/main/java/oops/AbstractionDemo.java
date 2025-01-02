package oops;

abstract class Bike{
	public void color() {
		System.out.println("Bike Color Blue...");
	}
	abstract void run();
}
class Active extends Bike{

	@Override
	void run() {
		System.out.println("Good @ Hyderabad Road");
	}
	
}
class FZ extends Bike{

	@Override
	void run() {
		System.out.println("Feel Like Sports");
		
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		Bike activa = new Active();
		activa.color();
		activa.run();
		Bike fz = new FZ();
		fz.color();
		fz.run();

	}

}
