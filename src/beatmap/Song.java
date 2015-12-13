package beatmap;

import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Song {
	private String name;
	private  BufferedImage pic;
	private String deemoURL;
	
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
			highScorComURL = new Scanner(new File(in.nextLine()));
			
		}catch(FileNotFoundException e){e.printStackTrace();}
		
		highScore = highScorComURL.nextInt();
		highCombo = highScorComURL.nextInt();
		//currently 2 file for 1 map
		
		try{
			pic = ImageIO.read(new File(in.nextLine()));
		}catch(IOException e){}
		deemoURL = in.nextLine();
		
	}


	public String getName() {
		return name;
	}

	public BufferedImage getPic() {
		return pic;
	}

	public String getDeemoURL() {
		return deemoURL;
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

}
