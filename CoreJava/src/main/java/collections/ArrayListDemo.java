package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(-2);
		al.add("Chandra");
		al.add(10);
		al.add(true);
		al.add(10);
		al.add('A');
		al.add(87);
		System.out.println("ArrayList Elements : "+al);
		System.out.println("--forward---");
		ListIterator lt = al.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("--Backword---");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
