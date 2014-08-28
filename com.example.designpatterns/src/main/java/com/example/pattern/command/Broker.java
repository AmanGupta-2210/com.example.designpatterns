/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Command
 */

package com.example.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class Broker {

	private List<Order> orders = new ArrayList<>();

	public void getOrder(Order order) {
		orders.add(order);
	}

	public void placeOrders() {
		for (Order order : orders) {
			order.execute();
		}
	}
}
