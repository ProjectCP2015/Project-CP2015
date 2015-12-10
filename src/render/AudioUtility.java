package render;

import java.applet.Applet;
import java.applet.AudioClip;

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

}
