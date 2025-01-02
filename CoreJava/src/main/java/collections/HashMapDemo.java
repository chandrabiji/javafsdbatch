package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap();
		//Adding key-values pairs
		hm.put(1, "Apple");
		hm.put(2, "Banana");
		hm.put(3, "Cherry");
		hm.put(null, "nnn");
		hm.put(4,null);
		System.out.println("HashMap Elements : "+hm);
		System.out.println("2 key value = "+hm.get(2));
		//Iterating through the map
		Set entries=hm.entrySet();
		System.out.println("Entrieys = "+entries);
		for(Map.Entry<Integer, String> entry:hm.entrySet()) {
			System.out.println("key : "+entry.getKey()+" "+"value : "+entry.getValue());
		}

	}

}
