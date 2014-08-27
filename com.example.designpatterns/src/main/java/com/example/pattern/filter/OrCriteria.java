/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Filter 
 */

package com.example.pattern.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class OrCriteria implements Criteria {

	private Criteria firstCriteria;
	private Criteria secondCriteria;

	public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> firstCriteriaPersons = firstCriteria.meetCriteria(persons);
		List<Person> secondCriteriaPersons = secondCriteria
				.meetCriteria(persons);

		// Method to find union of two lists.
		Set<Person> tempSet = new HashSet<>();
		tempSet.addAll(firstCriteriaPersons);
		tempSet.addAll(secondCriteriaPersons);
		return new ArrayList<Person>(tempSet);
	}

}
