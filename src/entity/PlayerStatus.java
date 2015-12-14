package entity;

import java.awt.Color;
import java.awt.Graphics2D;

import render.IRenderable;

public class PlayerStatus implements IRenderable {
	private int score = 0;
	private int hp = 100;
	private int combo = 0;
	private int feverGauge = 0;
	private boolean isFever = false;
	public PlayerStatus(){
		
	}
	public void addScore(int score){
		this.score = score + 10*combo;
	}
	public void decHp(int amount){
		hp -= amount;
	}
	public void incHp(int amount){
		hp += amount;
	}
	public void incCombo(Boolean isFever){
		if(isFever) combo +=2;
		else combo ++;
	}
	public void miss(){
		combo = 0;
		isFever = false;
	}
	
	public void gainFever(){
		if(!isFever){
			feverGauge +=2;			
		}
	}
	public int getScore() {
		return score;
	}
	public int getHp() {
		return hp;
	}
	public int getCombo() {
		return combo;
	}
	public int getFeverGauge() {
		return feverGauge;
	}
	public boolean isFever() {
		return isFever;
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x, y, width, height);
		g2d.setColor(Color.WHITE);
		g2d.setFont(font)
		g2d.drawString(str, x, y);
		g2d.drawString(str, x, y);
	}
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return -1;
	}

}
