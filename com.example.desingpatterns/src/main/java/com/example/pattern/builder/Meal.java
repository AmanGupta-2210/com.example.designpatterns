/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Builder 
 */

package com.example.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Meal {

	private List<Item> items = new ArrayList<Item>();

	/**
	 * 
	 * @param item
	 *            - Item to be added to the meal.
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 * 
	 * @return Total cost of the Meal.
	 */
	public float getPrice() {
		float price = 0.0F;
		for (Item item : items) {
			price += item.price();
		}
		return price;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println("Item Name :" + item.name());
			System.out.println("Item Price :" + item.price());
			System.out.println("Item Packing :" + item.packing().pack());
			System.out.println();
		}
	}
}
