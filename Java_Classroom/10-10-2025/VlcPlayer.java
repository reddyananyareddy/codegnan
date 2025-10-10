//10-10-2025
package com.codegnan.oop.interfaces;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing Vlc file: "+fileName);
		
	}

	@Override
	public void playMp4(String fileName) {
		// Do nothing VLC player doesn't support MP$ in this example
		
	}

}
