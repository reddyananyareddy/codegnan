//10-10-2025
package com.codegnan.oop.interfaces;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp3","beyond_the_horizon.mp3");
		//Formats supported via adapter
		audioPlayer.play("mp4","alone.mp4");
		audioPlayer.play("vlc","far_far_away.vlc");
		audioPlayer.play("avi","mind_me.avi");
	}
}
