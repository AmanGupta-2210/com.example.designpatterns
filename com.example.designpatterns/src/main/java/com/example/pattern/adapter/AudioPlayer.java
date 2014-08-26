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
public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {

		// Java 8 can use Strings in switch.
		switch (audioType) {
		case "Mp3":
			System.out.println("Playing Mp3 File :" + fileName);
			break;
		case "VLC":
		case "Mp4":
			MediaAdapter adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
			break;
		default:
			System.out.println("Invalid Media :" + audioType);
			break;
		}

	}

}
