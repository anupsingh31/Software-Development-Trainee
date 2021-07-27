package com.techlab.adapter.pattern;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advanceMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("Vlc")) {
			advanceMusicPlayer = new VlcPlayer();
		} else {
			advanceMusicPlayer = new Mp4Player();
		}

	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("Vlc")) {
			advanceMusicPlayer.playVlc(fileName);
		} else {
			advanceMusicPlayer.playMp4(fileName);
		}

	}

}
