package oops;
class Grandparent{
	void grandParentMethod() {
		System.out.println("This is the Grandparent class");
	}
}
class Parents extends Grandparent{
	void parentMethod() {
		System.out.println("This is the Parent class");
	}
}
class Childs extends Parents{
	void childMethod() {
		System.out.println("This is the Child class");
	}
}
public class MultiLevelInhertiance {

	public static void main(String[] args) {
		Childs obj = new Childs();
		obj.grandParentMethod();
		obj.parentMethod();
		obj.childMethod();

	}

}
