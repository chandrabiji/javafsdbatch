package innerclasses;

public class LocalInnerClass {//This is outer class
	
	private int a = 20;
	
	void outerMethod() {
		class LocalInner{
			void display() {
				System.out.println("A = "+a);
			}
		}
		LocalInner li = new LocalInner();
		li.display();
	}

	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.outerMethod();

	}

}
