package ui;

import java.applet.AudioClip;

import javax.swing.JButton;

import render.AudioUtility;

public class SongSelectButton extends JButton {
	public static int songNo = 0;
	protected AudioClip song;
	
	public SongSelectButton(){
		this.song = AudioUtility.songList.get(songNo);
		songNo++;
	}
	
	public void play(){
		this.song.loop();
	}

}
