//package f2.spw;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;

public class Enemy extends Sprite{
	
	private int step = 12;
	private boolean alive = true;
	
	public Enemy(int x, int y){
		super(x, y, 5, 10);
	}
	
	@Override
	public void draw(Graphics2D g){
		g.fillRect(x, y, width, height);
	}
	
	public void proceed(){
		y += step;
	}
}