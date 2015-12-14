package beatmap;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Song {
	private String name;
	private  BufferedImage pic;
	private AudioClip demo;
	
	private String path;
	PrintStream stream;
	private Scanner highScorComURL;
	
	private int highScore,highCombo;
	
	private Scanner in;	 
	
	public Song(String url){
		try {
			in = new Scanner(new File(url));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		name = in.nextLine();
		
		/*
		highScore = in.nextInt();
		highCombo = in.nextInt();
		*/
		try{
			path = in.nextLine();
			highScorComURL = new Scanner(new File(path));
			
		}catch(FileNotFoundException e){e.printStackTrace();}
		
		highScore = highScorComURL.nextInt();
		highCombo = highScorComURL.nextInt();
		//currently 2 file for 1 map
		
		try{
			pic = ImageIO.read(new File(in.nextLine()));
		}catch(IOException e){}
		
		try{ClassLoader loader = Song.class.getClassLoader();
		demo = Applet.newAudioClip(loader.getResource(in.nextLine()));
		}catch(StackOverflowError e){e.printStackTrace();};
	}


	public String getName() {
		return name;
	}

	public BufferedImage getPic() {
		return pic;
	}

	public AudioClip getDemo() {
		return demo;
	}

	public int getHighScore() {
		return highScore;
	}


	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}


	public int getHighCombo() {
		return highCombo;
	}


	public void setHighCombo(int highCombo) {
		this.highCombo = highCombo;
	}
	
	public void save(){
		try {
			stream = new PrintStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(stream);
		System.out.println(highScore);
		System.out.println(highCombo);
		
		
	
	}

}
