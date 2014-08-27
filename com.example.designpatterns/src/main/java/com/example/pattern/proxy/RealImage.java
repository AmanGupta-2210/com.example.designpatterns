/**
 * Author : Aman Gupta
 * Email Id : aman.tit10@gmail.com
 * Design Pattern : Proxy
 */

package com.example.pattern.proxy;

/**
 * @author Aman Gupta (aman.tit10@gmail.com)
 * @version 1.0
 */
public class RealImage implements Image {

	private String fileName;

	/**
	 * 
	 * @param fileName
	 *            - Name of Image.
	 */
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImage(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying Image :" + fileName);
	}

	/**
	 * 
	 * @param fileName
	 *            - Name of Image to be loaded from disk.
	 */
	private void loadImage(String fileName) {
		System.out.println("Loading Image :" + fileName);
	}

}
