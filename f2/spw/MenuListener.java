//package f2.spw;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuListener implements ActionListener{
	
    JMenuItem menuStop;
	JMenuItem menuRestart;
	JMenuItem menuExit;
    GameEngine engine;
    
    public MenuListener(JMenuItem menuStop,JMenuItem menuRestart,JMenuItem menuExit,GameEngine engine){
        this.menuStop = menuStop;
        this.menuRestart = menuRestart;
		this.menuExit = menuExit;
        this.engine = engine;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        clickMenu(e);
    }
    
    private void clickMenu(ActionEvent e){
		if(e.getSource() == menuStop){
            engine.die();
        }	
        if(e.getSource() == menuRestart){
            engine.start();
        }
        if(e.getSource() == menuExit){
            System.exit(0);
        }
    }
}
