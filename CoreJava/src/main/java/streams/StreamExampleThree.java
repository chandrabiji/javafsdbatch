package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExampleThree {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple","banana","apple","orange","grapes");
        Map<String,Long> itemCount = items.stream()
        		                          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(itemCount);
	}

}
