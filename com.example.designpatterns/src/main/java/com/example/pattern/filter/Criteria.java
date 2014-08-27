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
public interface Criteria {

	/**
	 * 
	 * @param persons
	 *            - List of Persons to be filtered.
	 * @return Filtered List.
	 */
	public List<Person> meetCriteria(List<Person> persons);
}
