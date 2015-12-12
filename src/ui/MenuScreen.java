package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import beatmap.Song;

public class MenuScreen extends JPanel {
	//********Currently Unused**********
	//public static List<Song> list = new CopyOnWriteArrayList<Song>();
	public MenuScreen(){
		super();
		//setPreferredSize(new Dimension(, arg1));
		setLayout(new GridBagLayout());
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}
	
	public JScrollPane westPanel(){
		JScrollPane scroll = new JScrollPane();
		return scroll;
	}
	
	public JPanel eastPanel(){
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		
		return panel;
	}
	
}
