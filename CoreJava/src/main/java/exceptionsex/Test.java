package exceptionsex;

public class Test {

	public static void main(String[] args) {
		System.out.println("First Line");
		try {
		System.out.println(10/2);
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			//System.exit(0);
		}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			System.err.println("Something went wrong");
			
		}finally {
			System.out.println("--finally--");
		}
		System.out.println("Last Line");

	}

}
