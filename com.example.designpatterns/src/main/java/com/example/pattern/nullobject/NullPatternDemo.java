/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Null Object
 */

package com.example.pattern.nullobject;

/**
 * Utility class to demonstrate Null Object Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class NullPatternDemo {

	public static void main(String[] args) {

		Customer aman = CustomerFactory.getCustomer("Aman");
		Customer amar = CustomerFactory.getCustomer("Amar");
		Customer avisek = CustomerFactory.getCustomer("Avisek");
		Customer ankit = CustomerFactory.getCustomer("Ankit");

		System.out.println(aman.getName());
		System.out.println(amar.getName());
		System.out.println(avisek.getName());
		System.out.println(ankit.getName());
	}

}
