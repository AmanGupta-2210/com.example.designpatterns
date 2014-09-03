/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Null Object
 */

package com.example.pattern.nullobject;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public abstract class Customer {

	protected String name;

	/**
	 * 
	 * @return Whether Customer exist or not.
	 */
	public abstract boolean isNull();

	/**
	 * 
	 * @return Name of the Customer.
	 */
	public abstract String getName();

}
