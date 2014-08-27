/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Filter 
 */

package com.example.pattern.filter;

import java.util.List;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class AndCriteria implements Criteria {

	private Criteria firstCriteria;
	private Criteria secondCriteria;

	public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = firstCriteria.meetCriteria(persons);
		return secondCriteria.meetCriteria(firstCriteriaPersons);
	}

}
