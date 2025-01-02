package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map = new TreeMap<>();
		//Adding key-value pairs
		map.put("Zebra",5);
		map.put("Apple", 2);
		map.put("Mango", 3);
		//Iterating through the map
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println("Key : "+e.getKey()+" "+"Value : "+e.getValue());
		}
        
	}

}
