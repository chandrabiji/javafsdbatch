package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(98);
		v.add(34);
		v.add(12);
		v.add(9);
		System.out.println("Vector Elements are: "+v);
		System.out.println("--Normal For Loop--");
		for(int i=0;i<v.size();++i) {
			System.out.println(v.get(i));
		}
		System.out.println("--using forEach--");
		for(int k:v) {
			System.out.println(k);
		}
		System.out.println("---Enumeration----");
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
