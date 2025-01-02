package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Employee implements Comparable<Employee>{
	public int eid;
	public String ename;
	public double salary;
	public Employee(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		if(e.eid>eid) {
			return 1;
		}else if(e.eid<eid) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
public class ArrayListSortDemo {

	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("zzz");
		al.add("bbb");
		al.add("aaa");
		al.add("ccc");
		System.out.println("Before sort Arraylist: "+al);
		Collections.sort(al);
		System.out.println("After sort ArrayList : "+al);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(3,"xyz",7899));
		employees.add(new Employee(2,"pqr",4899));
		employees.add(new Employee(1,"abc",3899));
		System.out.println("without sorting employee list");
		for(Employee e:employees) {
			System.out.println(e.eid+" "+e.ename+" "+e.salary);
		}
        Collections.sort(employees);
        System.out.println("After sorting employee list");
        for(Employee e:employees) {
			System.out.println(e.eid+" "+e.ename+" "+e.salary);
		}
	}

}
