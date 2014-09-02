/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : State 
 */

package com.example.pattern.state;

/**
 * Object whose state is to be managed.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Context {

	private State state = null;

	/**
	 * 
	 * @return State of the Object.
	 */
	public State getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 *            - StaOte of the Object.
	 */
	public void setState(State state) {
		this.state = state;
	}

}
