package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import render.AudioUtility;

public class WestPanel extends JScrollPane {
	protected BufferedImage bg;
	
	public WestPanel(){
		try {
		    bg = ImageIO.read(new File("res/titlebg.jpg"));
		} catch (IOException e) {
		}
		this.setPreferredSize(new Dimension(400, 600));
		this.setForeground(Color.BLACK);
		this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		int noOfSong = AudioUtility.songList.size();
		for (int i = 0; i < noOfSong; i++) {
			SongSelectButton a = new SongSelectButton();
			//a.setText(AudioUtility.songNameList.get(i));
			a.setSize(new Dimension(380,50));
			a.setForeground(Color.BLACK);
			//a.setBackground(Color.BLACK);
			a.setFont(new Font("Arial", Font.BOLD, 20));
			a.setText("Song1");
			this.add(a);
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(bg, null, 0, 0);
		//g2.setColor(Color.BLACK);
		//g2.setBackground(Color.BLACK);
		//g2.setFont(new Font("Arial", Font.BOLD, 30));
		//FontMetrics fm = g.getFontMetrics(new Font("Arial", Font.BOLD, 30));
		//int width = fm.stringWidth("press any key");
		//g2.drawString("press any key", screenWidth/2- width/2,(int) (0.75*screenHeight));

	}
}
