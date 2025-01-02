package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(89);
		lhs.add(3);
		lhs.add("abc");
		lhs.add(3);
		lhs.add(false);
		lhs.add(3);
		System.out.println("LinkedHashSet Elements are: "+lhs);

	}

}
