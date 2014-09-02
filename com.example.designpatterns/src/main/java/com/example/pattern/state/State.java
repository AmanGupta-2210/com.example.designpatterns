/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : State 
 */

package com.example.pattern.state;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public interface State {

	/**
	 * 
	 * @param context
	 *            - Object whose state is to be managed.
	 */
	public void doAction(Context context);
}
