package render;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import beatmap.Song;

public class AudioUtility {
	
	
	private static AudioClip acIntro;
	static{
		ClassLoader loader = AudioUtility.class.getClassLoader();
		acIntro = Applet.newAudioClip(loader.getResource("res/intro.wav"));
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
