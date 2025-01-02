package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map =new LinkedHashMap();
		map.put(3, "Elephant");
		map.put(1, "Dog");
		map.put(2, "Cat");
		
		//Iterating through the map
		for(Map.Entry<Integer, String> e:map.entrySet()) {
			System.out.println("Key : "+e.getKey()+" "+"Value : "+e.getValue());
		}

	}

}
