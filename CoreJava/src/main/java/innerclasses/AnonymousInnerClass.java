package innerclasses;

abstract class Animal{
	abstract void sound();
}
interface Anonymous{
	public void test();
}
public class AnonymousInnerClass{

	public static void main(String[] args) {
		Animal obj = new Animal() {
			void sound() {
				System.out.println("Woof Woof!");
			}
		};
		obj.sound();
		Anonymous obj1 = new Anonymous() {
			public void test() {
				System.out.println("this is test method");
			}
		};
		obj1.test();

	}

}
