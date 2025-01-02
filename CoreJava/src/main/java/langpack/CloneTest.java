package langpack;

public class CloneTest implements Cloneable{
	
	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneTest c1 = new CloneTest();
		System.out.println("A = "+c1.a);
		System.out.println("B = "+c1.b);
		CloneTest c2 = (CloneTest) c1.clone();
		System.out.println("Clone Object A = "+c2.a);
		System.out.println("Clone Object B = "+c2.b);

	}

}
