package oops;

//Parent
class Animal{
	void eat() {
		System.out.println("Animal is eating...");
	}
}

//Child class inheriting from Parent
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		//Create instance
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

	}

}
