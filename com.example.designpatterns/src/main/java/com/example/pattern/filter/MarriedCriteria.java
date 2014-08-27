/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Filter 
 */

package com.example.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Filters persons who are married.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class MarriedCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> marriedPersons = new ArrayList<>();

		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("Married")) {
				marriedPersons.add(person);
			}
		}

		return marriedPersons;
	}

}
