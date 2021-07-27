package com.techlab.adapter.pattern.test;

import com.techlab.adapter.pattern.AudioPlayer;

public class AdapterPatternTest {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("Mp3", "beyod the earth.mp3");
		audioPlayer.play("Mp4", "lets party.mp4");
		audioPlayer.play("Vlc", "far far away.vlc");
		audioPlayer.play("Avi", "plugin.avi");
	}

}
