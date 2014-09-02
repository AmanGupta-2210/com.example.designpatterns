/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Observer
 */

package com.example.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
