/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Adapter
 */

package com.example.pattern.adapter;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public interface MediaPlayer {

	/**
	 * 
	 * @param audioType
	 *            - File Format.
	 * @param fileName
	 *            - File Name.
	 */
	public void play(String audioType, String fileName);

}
