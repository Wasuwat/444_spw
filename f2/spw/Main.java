//package f2.spw;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
		
        JMenuBar menubar = new JMenuBar();
        JMenu menuMain = new JMenu("Menu");
        JMenu menuAbout = new JMenu("Exit");
		JMenuItem menuStop = new JMenuItem("Pause");
        JMenuItem menuRestart =new JMenuItem("Resume");
        JMenuItem menuExit = new JMenuItem("Exit");

		menuMain.add(menuStop);
		menuMain.add(menuRestart);
		menuAbout.add(menuExit);
		
		menubar.add(menuMain);
        menubar.add(menuAbout);
        frame.setJMenuBar(menubar);
		
		SpaceShip v = new SpaceShip(180, 550, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp, v);
		
		MenuListener menuListener = new MenuListener(menuStop,menuRestart,menuExit,engine);
        menuStop.addActionListener(menuListener);
        menuRestart.addActionListener(menuListener);
		menuExit.addActionListener(menuListener);
		
		frame.addKeyListener(engine);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
		
		engine.start();
	}
}