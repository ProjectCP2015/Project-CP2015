package render;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Note{
	private int type;
	private int length;
	private int line;
	private int coY,V;
	private int time;
	private BufferedImage img;
	public Note(int type,int length, int line, int coY, int V, int time){
		this.type = type;
		this.length = length;
		this.line = line;
		this.coY = coY;
		this.V = V;
		this.time = time;
		try{
			img = ImageIO.read(new File(""));
		}catch(IOException e){e.printStackTrace();}
	}


}
