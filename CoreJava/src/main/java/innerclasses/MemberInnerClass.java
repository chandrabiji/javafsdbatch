package innerclasses;

public class MemberInnerClass { //This is outer class

	private int a = 10;
	
	class InnerClass{ //This is Inner class
		void display() {
			System.out.println("A = "+a);
		}
	}
	public void message() {//This method is outer class method
		InnerClass in = new InnerClass();
		in.display();
	}
	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		obj.message();
		MemberInnerClass.InnerClass mi = new MemberInnerClass().new InnerClass();
		mi.display();

	}

}
