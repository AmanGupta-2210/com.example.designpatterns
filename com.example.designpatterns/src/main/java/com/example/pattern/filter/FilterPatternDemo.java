/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Filter 
 */

package com.example.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to demonstrate Filter Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class FilterPatternDemo {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Aman", "Male", "Single"));
		persons.add(new Person("Amar", "Male", "Single"));
		persons.add(new Person("Avisek", "Male", "Married"));
		persons.add(new Person("Ankit", "Male", "Married"));
		persons.add(new Person("Kareena", "Female", "Married"));
		persons.add(new Person("Katrina", "Female", "Single"));
		persons.add(new Person("Himanshu", "Male", "Married"));

		Criteria maleCriteria = new MaleCriteria();
		Criteria femaleCriteria = new FemaleCriteria();
		Criteria singleCriteria = new SingleCriteria();
		Criteria marriedCriteria = new MarriedCriteria();
		Criteria maleAndSingle = new AndCriteria(maleCriteria, singleCriteria);
		Criteria maleOrMarried = new OrCriteria(maleCriteria, marriedCriteria);

		System.out.println("Males :");
		printPersons(maleCriteria.meetCriteria(persons));

		System.out.println("Females :");
		printPersons(femaleCriteria.meetCriteria(persons));

		System.out.println("Singles :");
		printPersons(singleCriteria.meetCriteria(persons));

		System.out.println("Married :");
		printPersons(marriedCriteria.meetCriteria(persons));

		System.out.println("Male and Single :");
		printPersons(maleAndSingle.meetCriteria(persons));

		System.out.println("Male or Married :");
		printPersons(maleOrMarried.meetCriteria(persons));

	}

	private static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Name :" + person.getName());
			System.out.println("Gender :" + person.getGender());
			System.out.println("Marital Status :" + person.getMaritalStatus());
			System.out.println();
		}
	}

}
