package collections;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<Object, String> map = new WeakHashMap<Object, String>();
		//Key with a strong reference
		Object strongKey = new Object();
		map.put(strongKey, "Strong value");
		//key with no strong reference
		Object weakKey = new Object();
		map.put(weakKey, "Weak Value");
		System.out.println("Map before GC : "+map);
		weakKey=null;
		//Suggest garbage collection
		System.gc();
		//wait for GC to complete
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Map After GC : "+map);

	}

}
