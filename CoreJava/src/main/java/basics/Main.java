package basics;

class Person{
	
	private String name;
	
	//Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Sai");
		System.out.println(person.getName());

	}

}
