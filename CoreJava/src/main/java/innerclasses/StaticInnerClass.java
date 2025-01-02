package innerclasses;

public class StaticInnerClass {
	
	public static int a = 40;
	
	static class StaticInner{
		static void display() {
			System.out.println("A = "+a);
		}
	}

	public static void main(String[] args) {
		StaticInnerClass.StaticInner.display();

	}

}
