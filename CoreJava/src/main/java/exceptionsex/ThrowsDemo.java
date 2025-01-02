package exceptionsex;

public class ThrowsDemo {

	public void method()throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		System.out.println("First Line");
		try {
			obj.method();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last Line");

	}

}
