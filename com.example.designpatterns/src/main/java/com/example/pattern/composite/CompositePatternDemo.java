/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Composite
 */

package com.example.pattern.composite;

/**
 * Utility class to demonstrate Composite Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class CompositePatternDemo {

	public static void main(String[] args) {

		Employee CEO = new Employee("Aman", "HAL", 20000000);
		Employee CFO = new Employee("Ashwin", "Infofusion", 10000000);
		Employee leadEngineer = new Employee("Anshul", "TCO", 5000000);
		Employee leadDeveloper = new Employee("Himanshu", "Slate", 5000000);
		Employee leadManager = new Employee("Amar", "Slate", 5000000);

		CEO.addSubordinate(CFO);
		CFO.addSubordinate(leadManager);
		CFO.addSubordinate(leadEngineer);
		CFO.addSubordinate(leadDeveloper);

		System.out.println(CEO);
		for (Employee employee : CEO.getSubordinates()) {
			System.out.println(employee);
			for (Employee employee2 : employee.getSubordinates()) {
				System.out.println(employee2);
			}
		}
	}

}
