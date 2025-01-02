package basics;

public class StaticExample {

	public static int count  = 0;
	public static void main(String[] args) {
		add();
		System.out.println("Count = "+count);
		msg();

	}
	public static void add() {
		count = count+1;
	}
	public static void msg() {
		System.out.println("value = "+count);
	}

}
