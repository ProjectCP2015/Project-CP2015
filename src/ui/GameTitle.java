package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import render.AudioUtility;


public class GameTitle extends JPanel {
	protected BufferedImage bg ;
	public int screenWidth;
	public int screenHeight;
	protected JLabel press;
	
	public GameTitle(){
		//bg = render.Resources.titleBg;
		//this.setLayout(null);
		try {
		    bg = ImageIO.read(new File("res/titlebg.jpg"));
		} catch (IOException e) {
		}
		//play intro
		AudioUtility.playSound("intro");
		
		if(bg == null) System.out.println("null");
		screenWidth = (int) bg.getWidth();
		screenHeight = (int) bg.getHeight();
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		setDoubleBuffered(true);
		press = new JLabel("press any key");
		press.setForeground(Color.WHITE);
		press.setBackground(Color.BLACK);
		press.setFont(new Font("Arial", Font.BOLD, 30));
		this.add(press);
		//press.setBounds(new Rectangle(new Point(200, 300)));
		Fader presss = new Fader(press);
		Thread t = new Thread(presss);
		//System.out.println(press.getForeground().getAlpha());
		t.start();
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				AudioUtility.stop("intro");
			}
		});
		
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;		
		g2.drawImage(bg, null, 0, 0);
		//g2.setColor(Color.WHITE);
		//g2.setFont(new Font("Arial", Font.BOLD, 30));
		//FontMetrics fm = g.getFontMetrics(new Font("Arial", Font.BOLD, 30));
		//int width = fm.stringWidth("press any key");
		//g2.drawString("press any key", screenWidth/2- width/2,(int) (0.75*screenHeight));

	}

}