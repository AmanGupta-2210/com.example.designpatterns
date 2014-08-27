/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Composite
 */

package com.example.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Employee {

	private String name;
	private String department;
	private int salary;
	private List<Employee> subordinates = new ArrayList<>();

	/**
	 * 
	 * @param name
	 *            - Name of the Employee.
	 * @param department
	 *            - Department of the Employee.
	 * @param salary
	 *            - Salary of the Employee.
	 */
	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	/**
	 * 
	 * @param employee
	 *            - Employee to be Added.
	 */
	public void addSubordinate(Employee employee) {
		subordinates.add(employee);
	}

	/**
	 * @param employee
	 *            - Employee to be removed.
	 * @return True if Employee is removed.
	 */
	public boolean removeSubordinate(Employee employee) {
		return subordinates.remove(employee);
	}

	/**
	 * 
	 * @return List of Subordinates.
	 */
	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return "Name :" + name + "\nDepartment :" + department + "\nSalary :"
				+ salary + "\n";
	}

}
