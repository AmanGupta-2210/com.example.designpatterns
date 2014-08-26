/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Adapter
 */

package com.example.pattern.adapter;

/**
 * Utility Class to demonstrate Adapter Design Pattern.
 * 
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("Mp3", "Boulevard of Broken Dreams");
		audioPlayer.play("Mp4", "Here I am");
		audioPlayer.play("VLC", "Tik Tok");

		audioPlayer.play("avi", "21st Century Breakdown");
	}

}
