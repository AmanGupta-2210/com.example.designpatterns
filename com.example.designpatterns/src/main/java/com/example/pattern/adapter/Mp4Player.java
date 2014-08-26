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
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		// Do Nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 File :" + fileName);
	}

}
