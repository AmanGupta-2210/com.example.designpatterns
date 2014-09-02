/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : State 
 */

package com.example.pattern.state;

/**
 * Utility class to demonstrate State Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class StatePatternDemo {

	public static void main(String[] args) {

		Context context = new Context();

		State startState = new StartState();
		startState.doAction(context);
		System.out.println("First State :" + context.getState());
		System.out.println();

		State stopState = new StopState();
		stopState.doAction(context);
		System.out.println("Second State :" + context.getState());

	}

}
