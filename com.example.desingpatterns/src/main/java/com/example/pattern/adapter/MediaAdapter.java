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
public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {

		// Java 8 can use Strings in switch
		switch (audioType) {
		case "VLC":
			advancedMediaPlayer = new VLCPlayer();
			break;
		case "Mp4":
			advancedMediaPlayer = new Mp4Player();
			break;
		default:
			break;
		}
	}

	@Override
	public void play(String audioType, String fileName) {

		// Java 8 can use Strings in switch
		switch (audioType) {
		case "VLC":
			advancedMediaPlayer.playVLC(fileName);
			break;
		case "Mp4":
			advancedMediaPlayer.playMp4(fileName);
			break;
		default:
			break;
		}
	}

}
