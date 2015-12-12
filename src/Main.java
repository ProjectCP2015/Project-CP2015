import java.awt.Dimension;

import javax.swing.JFrame;

import render.AudioUtility;
import ui.GameTitle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Beat Track");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameTitle gameTitle = new GameTitle();
		//window.setPreferredSize(new Dimension(gameTitle.screenWidth,gameTitle.screenHeight));
		window.setPreferredSize(new Dimension(515,545));
		window.add(gameTitle);
		window.pack();
		window.setVisible(true);
		
	}

}
