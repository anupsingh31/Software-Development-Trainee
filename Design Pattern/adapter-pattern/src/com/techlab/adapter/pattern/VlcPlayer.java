package com.techlab.adapter.pattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("play Vlc file.name " + fileName);

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Nothing");

	}

}
