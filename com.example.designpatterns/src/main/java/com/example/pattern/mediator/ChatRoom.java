/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Mediator
 */

package com.example.pattern.mediator;

import java.util.Date;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class ChatRoom {

	/**
	 * 
	 * @param user
	 *            - User who send the message.
	 * @param message
	 *            - Message send by the User.
	 */
	public static void printMessage(User user, String message) {
		System.out.println(user.getName() + " " + new Date().toString() + " "
				+ message);
	}
}
