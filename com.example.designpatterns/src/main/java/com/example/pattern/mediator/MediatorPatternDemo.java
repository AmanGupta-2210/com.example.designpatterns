/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Mediator
 */

package com.example.pattern.mediator;

/**
 * Utility class to demonstrate Mediator Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class MediatorPatternDemo {

	public static void main(String[] args) {

		User aman = new User("Aman");
		User amar = new User("Amar");
		User himanshu = new User("Himanshu");

		aman.sendMessage("How are you?");
		amar.sendMessage("I am fine");
		himanshu.sendMessage("Where are you?");
		amar.sendMessage("I am in Hyderabad");

	}

}
