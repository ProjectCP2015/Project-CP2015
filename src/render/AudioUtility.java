package render;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import beatmap.Song;

public class AudioUtility {
	
	public static ArrayList<AudioClip> songList = new ArrayList<AudioClip>() ;
	public static List<String> songNameList;
	private static AudioClip acIntro;
	static{
		ClassLoader loader = AudioUtility.class.getClassLoader();
		acIntro = Applet.newAudioClip(loader.getResource("res/intro.wav"));
		songList.add(acIntro);
	}
	public static void playSound(String identifier){
		if(identifier.equals("intro")) {
			//acIntro.play();
			acIntro.loop();
		}
		
	}
	public static void stop(String identifier){
		if(identifier.equals("intro")){
			acIntro.stop();
		}
	}

}
