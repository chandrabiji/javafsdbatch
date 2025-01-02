package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(new Integer(30));
		hs.add("Chandra");
		hs.add(true);
		hs.add('B');
		hs.add(4.55);
		System.out.println("HashSet Elements are: "+hs);
		System.out.println("contains :"+hs.contains("Chandra"));
		hs.remove("Chandra");
		System.out.println("After remove chandra HashSet :  "+hs);
		HashSet hs1 = new HashSet();
		hs1.add(100);
		hs1.add(200);
		System.out.println("Second HashSet Elements are : "+hs1);
		hs.addAll(hs1);
		System.out.println("After adding second HashSet : "+hs);
		System.out.println(hs.containsAll(hs1));
		hs.removeAll(hs1);
		System.out.println(hs);
	    hs1.clear();
	    System.out.println("After clear second HashSet : "+hs1);
	    System.out.println(hs1.isEmpty());
	    Iterator it = hs.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }

	}

}
