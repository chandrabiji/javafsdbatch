package flowcontroller;

public class ReturnDemo {
	
	public int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		ReturnDemo obj = new ReturnDemo();
		int result = obj.add(10, 20);
		System.out.println("Addition value = "+result);
				

	}

}
