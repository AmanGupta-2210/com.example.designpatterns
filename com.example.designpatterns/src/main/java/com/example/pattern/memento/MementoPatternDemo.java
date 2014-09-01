/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Memento 
 */

package com.example.pattern.memento;

/**
 * Utility class to demonstrate Memento Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class MementoPatternDemo {

	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State 1");
		originator.setState("State 2");
		originator.setState("State 3");
		careTaker.addMemento(originator.saveStateToMemento());
		originator.setState("State 4");
		careTaker.addMemento(originator.saveStateToMemento());
		originator.setState("State 5");

		System.out.println("Current State :" + originator.getState());
		System.out.println("First Saved State :"
				+ careTaker.getMemento(0).getState());
		System.out.println("Second Saved State :"
				+ careTaker.getMemento(1).getState());

	}
}
