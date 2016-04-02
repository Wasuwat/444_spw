//package f2.spw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Timer;


public class GameEngine{
	GamePanel gp;
	
	private SpaceShip v;	
	
	public GameEngine(GamePanel gp, SpaceShip v){
		this.gp = gp;
		this.v = v;		
		
		gp.sprites.add(v);
		process();
	}
	
	private void process(){
		gp.updateGameUI();
	}
}