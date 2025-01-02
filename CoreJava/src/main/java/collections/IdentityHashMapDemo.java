package collections;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<String, String> map= new IdentityHashMap<String, String>();
		//Using two different String object with the same value
		String key1 = new String("A");
		String key2 = new String("A");
		map.put(key1, "Value1");
		map.put(key2,"Value2");
		System.out.println("Map Size : "+map.size());
		System.out.println("Map contents : "+map);

	}

}
