package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemoOne {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sekhar","Deepthi","Santosh","Jhansi","Sekhar","Yamini","Chandra","Sai");
		names.stream()
		     .filter(n->n.startsWith("S"))
		     .map(String::toUpperCase)
		     .distinct()
		     .sorted()
		     .forEach(System.out::println);

	}

}
