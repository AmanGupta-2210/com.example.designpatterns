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
public class CustomerFactory {

	private static final String[] names = { "Aman", "Amar", "Himanshu",
			"Ankit", "Sonu", "Amit" };

	/**
	 * 
	 * @param name
	 *            - Name of the Customer.
	 * @return Customer Object if it exists in the database.
	 */
	public static Customer getCustomer(String name) {
		for (String s : names) {
			if (s.equalsIgnoreCase(name))
				return new RealCustomer(name);
		}
		return new NullCustomer();
	}
}
