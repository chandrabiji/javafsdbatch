package javafeatures;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sekhar","Deepthi","Yamini","Jhansi","Chandra");
		names.forEach(System.out::println);

	}

}
