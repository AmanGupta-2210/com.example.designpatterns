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
public class Originator {
	/**
	 * State similar to the state of Memento Class.
	 */
	private String state;

	/**
	 * 
	 * @return State of Memento object.
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 *            - State of Memento object.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return Memento object containing the current state.
	 */
	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	/**
	 * 
	 * @param memento
	 *            - Memento object from where state is to be retrieved.
	 */
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
