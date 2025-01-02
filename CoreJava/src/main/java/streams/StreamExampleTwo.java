package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExampleTwo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,6,5,2,8,6);
		int sum = numbers.stream()
				         .filter(n->n%2==0)
				         .reduce(0, Integer::sum);
		System.out.println("Sum of Integers = "+sum);
		//Parallel Stream
		List<Integer> numbersList = Arrays.asList(1,2,3,4,5);
		numbersList.parallelStream()
		           .forEach(System.out::println);

	}

}
