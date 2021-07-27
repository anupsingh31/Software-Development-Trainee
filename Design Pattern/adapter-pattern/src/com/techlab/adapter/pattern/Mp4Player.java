package com.techlab.adapter.pattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Nothing");

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Mp4 player file name " + fileName);

	}

}
