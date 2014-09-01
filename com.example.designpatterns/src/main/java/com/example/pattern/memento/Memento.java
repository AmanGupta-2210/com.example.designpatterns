/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Memento 
 */

package com.example.pattern.memento;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Memento {

	private String state;

	/**
	 * 
	 * @param state
	 *            - State of Memento.
	 */
	public Memento(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return State of Memento.
	 */
	public String getState() {
		return state;
	}

}
