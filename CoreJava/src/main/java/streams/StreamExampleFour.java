package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	String name;
	int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class StreamExampleFour {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Abc",29),
				new Employee("Xyz",35),
				new Employee("Pqr",35)
				);
		List<String> result = employees.stream()
				                       .filter(e->e.getAge()>30)
				                       .map(Employee::getName)
				                       .sorted()
				                       .collect(Collectors.toList());
		System.out.println(result);

	}

}
