//10-10-2025
package com.codegnan.oop.interfaces;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// Do nothing VLC player doesn't support MP4 format
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 file: "+fileName);
		
	}

}
