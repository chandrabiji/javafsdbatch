package javafeatures;
@FunctionalInterface
interface Greetings{
	public void sayHello(String name);
}
@FunctionalInterface
interface Calculation{
	public int add(int a, int b);
}
class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Greetings greetings =(name)->System.out.println("Welcome to java 8 features Mr. "+name);
		greetings.sayHello("Sekhar");
		Calculation calc =(a, b) ->a+b;
		int result =calc.add(10, 20);
		System.out.println(result);

	}

}
