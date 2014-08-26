/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Builder 
 */

package com.example.pattern.builder;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class MealBuilder {

	/**
	 * 
	 * @return Veg Meal.
	 */
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	/**
	 * 
	 * @return Non Veg Meal.s
	 */
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new EggBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
