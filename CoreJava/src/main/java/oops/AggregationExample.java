package oops;
class Employee{
	private String name;
	Employee(String name){
		this.name=name;
	}
	void display() {
		System.out.println("Employee Name : "+name);
	}
}
class Department{
	private String deptName;
	private Employee[] employees;
	public Department(String deptName, Employee[] employees) {
		this.deptName = deptName;
		this.employees = employees;
	}
	void displayDepartmentDetails() {
		System.out.println("Department Name: "+deptName);
		System.out.println("Employees in Department");
		for(Employee emp:employees) {
			emp.display();
		}
	}
	
}
public class AggregationExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sekhar");
		Employee e2 = new Employee("Chandra");
		Employee[] employees = {e1,e2};
		
		Department dept = new Department("IT",employees);
		dept.displayDepartmentDetails();

	}

}
