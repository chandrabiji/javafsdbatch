package oops;
class SingleParent{
	void parentMethod() {
		System.out.println("This is the Parent Method");
	}
}
class Child1 extends SingleParent{
	void child1Method() {
		System.out.println("This is the first child");
	}
}
class Child2 extends SingleParent{
	void child2Method() {
		System.out.println("This is the second child");
	}
}
public class HierrachicalInheritance {

	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		obj1.parentMethod();
		obj1.child1Method();
		
		Child2 obj2 = new Child2();
		obj2.parentMethod();
		obj2.child2Method();

	}

}
