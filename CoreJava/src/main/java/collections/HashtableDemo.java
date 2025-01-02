package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new Hashtable();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3,"Blue");
		for(Map.Entry<Integer, String> entries :map.entrySet()) {
			System.out.println("key : "+entries.getKey()+" "+"Value : "+entries.getValue());
		}

	}

}
