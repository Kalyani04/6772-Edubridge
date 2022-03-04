// Create an Employee class with the related attributes and
//behaviours. Create one more class EmployeeDB which has the
//following methods. a. boolean addEmployee(Employee e) b.
//boolean deleteEmployee(int eCode) c. String showPaySlip(int
//eCode) d. Employee[] listAll() Use an ArrayList which will be
//used to store the emplyees and use enumeration/iterator to
//process the employees. Write a Test Program to test that all
//functionalities are operational.

package collection;

import java.util.*;

public class AssiQNo2 
{
	List<Employee> employeeDb = new ArrayList<>();
	
	public boolean addEmployee(Employee e) 
	{
		return employeeDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = employeeDb.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getEmpSalary();
			}
		}

		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}
	
}