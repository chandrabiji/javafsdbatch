package oops;
interface A{
	void methodA();
}
interface B {
	void methodB();
}
class C implements B,A{

	@Override
	public void methodB() {
		System.out.println("Method B from Interface B");
		
	}

	@Override
	public void methodA() {
		System.out.println("Method A from Interface A");
		
	}
	
}
public class HybridInheritance {

	public static void main(String[] args) {
		C obj =new C();
		obj.methodA();
		obj.methodB();
		
		A objA = new C();
		objA.methodA();
		
		B objB = new C();
		objB.methodB();

	}

}
