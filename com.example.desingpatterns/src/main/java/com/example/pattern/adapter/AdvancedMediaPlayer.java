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
public interface AdvancedMediaPlayer {

	/**
	 * 
	 * @param fileName
	 *            - File Name.
	 */
	public void playVLC(String fileName);

	/**
	 * 
	 * @param fileName
	 *            - File Name.
	 */
	public void playMp4(String fileName);

}
