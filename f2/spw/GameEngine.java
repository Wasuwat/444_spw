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
	
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	private SpaceShip v;	
	
	private Timer timer;
	
	private double difficulty = 0.1;
	
	public GameEngine(GamePanel gp, SpaceShip v){
		this.gp = gp;
		this.v = v;
		
		gp.sprites.add(v);
		
		timer = new Timer(50, new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				process();
			}
		});
	}
	
	public void start(){
		timer.start();
	}
	
	private void generateEnemy(){
		Enemy e = new Enemy((int)(Math.random()*390), 30);
		gp.sprites.add(e);
		enemies.add(e);
	}
	
	private void process(){
		if(Math.random() < difficulty){
			generateEnemy();
		}
		
		Iterator<Enemy> e_iter = enemies.iterator();
		while(e_iter.hasNext()){
			Enemy e = e_iter.next();
			e.proceed();
		}
		
		gp.updateGameUI();
		
	}
}