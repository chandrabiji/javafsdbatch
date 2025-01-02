package oops;

class Animals{
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animals{
	void sound() {
		System.out.println("Cat meows");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Animals myCat = new Cat();
		myCat.sound();

	}

}
