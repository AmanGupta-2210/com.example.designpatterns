/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Filter 
 */

package com.example.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Filters persons who are female.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class FemaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> femalePersons = new ArrayList<>();

		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("Female")) {
				femalePersons.add(person);
			}
		}

		return femalePersons;
	}

}
