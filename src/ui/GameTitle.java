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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import render.AudioUtility;


public class GameTitle extends JPanel {
	protected BufferedImage bg ;
	public int screenWidth;
	public int screenHeight;
	protected JLabel press;
	
	public GameTitle(){
		try {
		    bg = ImageIO.read(new File("res/titlebg2.jpg"));
		} catch (IOException e) {
		}
		AudioUtility.playSound("intro");
		if(bg == null) System.out.println("null");
		screenWidth = (int) bg.getWidth()+5;
		screenHeight = (int) bg.getHeight()+35;
		this.setSize(new Dimension(screenWidth, screenHeight));
		setDoubleBuffered(true);
		press = new JLabel("press any key",SwingConstants.CENTER);
		press.setForeground(Color.WHITE);
		press.setBackground(Color.BLACK);
		press.setFont(new Font("Arial", Font.BOLD, 30));
		this.setLayout(null);
		this.add(press);
		Dimension size = press.getPreferredSize();
		press.setBounds(screenWidth/2-size.width/2,3*screenHeight/4-size.height/2, size.width, size.height);
		Fader presss = new Fader(press);
		Thread t = new Thread(presss);
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

		//how to add listener to all key?
		
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