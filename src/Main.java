import java.awt.Dimension;

import javax.swing.JFrame;

import render.AudioUtility;
import ui.GameMenu;
import ui.GameTitle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Beat Track");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//GameTitle gameTitle = new GameTitle();
		//window.setSize(new Dimension(gameTitle.screenWidth,gameTitle.screenHeight));
		//window.add(gameTitle);
		testTitle(window);
		//testMenu(window);
		JFrame.setDefaultLookAndFeelDecorated(true);
		window.setResizable(false);
		window.setVisible(true);
		
	}
	
	public static void testTitle(JFrame window){
		GameTitle gameTitle = new GameTitle();
		window.setSize(new Dimension(gameTitle.screenWidth,gameTitle.screenHeight));
		window.add(gameTitle);
	}
	
	public static void testMenu(JFrame window){
		GameMenu menu = new GameMenu();
		window.setSize(new Dimension(800,600));
		window.add(menu);
	}

}
