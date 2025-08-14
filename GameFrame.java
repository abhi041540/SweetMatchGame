package candycrust;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JButton;

public class GameFrame extends JFrame 
{
   TimePanel tp;
   Panel p;
   JSplitPane sp;
   public GameFrame()
   {
	   
	   setSize(Toolkit.getDefaultToolkit().getScreenSize());
	   setVisible(true);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setLayout(new FlowLayout());
	   tp=new TimePanel();
	   sp=new JSplitPane();
	   p=new GamePanel(this,tp);
	   sp.setOrientation(JSplitPane.VERTICAL_SPLIT);
	   sp.setEnabled(false);
	   add(sp);
	   sp.setLeftComponent(tp);
	   sp.setRightComponent(p);
	   p.setPreferredSize(new Dimension(600,600));
   }
   @Override
   public void paint(Graphics g)
   {
	   g.drawImage(CandyCrustButton.GAME_BACKGROUND, 0, 0, getWidth(), getHeight(), this);
   }
}
