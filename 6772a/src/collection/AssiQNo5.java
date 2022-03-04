/*
Create an ArrayList of Employee( id,name,address,sal) objects and search id
for particular Employee object based on id number.
 */


package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class AssiQNo5 {

	public static void main(String[] args) 
	{
	
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101, "Bobby", "123 street, India", 20000.0));
		list.add(new Employee(102, "Ali", "234 street, Canada", 30000.0));
		list.add(new Employee(103, "Joe", "345 street, Philipines", 25000.0));
		list.add(new Employee(104, "Stain", "456 street, mexico", 40000.0));
		
		Iterator<Employee> it = list.iterator();
	
		Scanner Id = new Scanner(System.in);
		System.out.println("Enter ID");
		int searchId = Id.nextInt() ;
		
//		int searchId = 102;
		while (it.hasNext()) 
		{
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}