/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Memento 
 */

package com.example.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class CareTaker {

	private List<Memento> mementoList = new ArrayList<>();

	/**
	 * 
	 * @param memento
	 *            - Memento Object along with it's state.
	 */
	public void addMemento(Memento memento) {
		mementoList.add(memento);
	}

	/**
	 * 
	 * @param index
	 *            - State Number.
	 * @return- Memento object according to the state number.
	 */
	public Memento getMemento(int index) {
		return mementoList.get(index);
	}
}
