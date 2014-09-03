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
public class RealCustomer extends Customer {

	/**
	 * 
	 * @param name
	 *            - Name of the Customer.
	 */
	public RealCustomer(String name) {
		super.name = name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return super.name;
	}

}
