/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Filter 
 */

package com.example.pattern.filter;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Person {

	private String name;
	private String gender;
	private String maritalStatus;

	/**
	 * 
	 * @param name
	 *            - Name of Person.
	 * @param gender
	 *            - Gender of Person.
	 * @param maritalStatus
	 *            - Marital Status of Person.
	 */
	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	/**
	 * 
	 * @return Name of Person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return Gender of Person.
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 
	 * @return Marital Status of Person.
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
}
