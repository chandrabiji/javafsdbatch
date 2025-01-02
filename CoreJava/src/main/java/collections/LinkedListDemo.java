package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(new Integer(40));
		ll.add("Chandra");
		ll.add(true);
		ll.add('A');
		ll.add(null);
		System.out.println("LinkedList Elements are : "+ll);
		System.out.println("--forward--");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator desc = ll.descendingIterator();
		System.out.println("--Backword--");
		while(desc.hasNext()) {
			System.out.println(desc.next());
		}

	}

}
