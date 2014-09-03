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
public class NullCustomer extends Customer {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Name not found in Database.";
	}

}
