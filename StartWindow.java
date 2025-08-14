package candycrust;


import java.awt.Desktop;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.Timer;



public class StartWindow extends Frame
{
	static Panel p1;
	Point p;
	int iw,ih;
	ImageIcon ie;Frame f;
 public StartWindow(String str)
 {
	 super(str);
	 f=this;
	 setLayout(null);
	 setSize(Toolkit.getDefaultToolkit().getScreenSize());
	 addWindowListener(new WindowAdapter() {
		 @Override
		 public void windowClosing(WindowEvent we)
		 {
			 System.exit(0);
		 }
	 });
	 Image im=CandyCrustButton.PLAY_BUTTON.getScaledInstance(150, 80, Image.SCALE_SMOOTH);
	 ie=new ImageIcon(im);
      
	 iw=ie.getIconWidth();
	 ih=ie.getIconHeight();
	 p1=new ButtonPanel(this);
	 p1.setBounds(this.getWidth()/2-iw+20,this.getHeight()/2-ih-20,iw-14, ih-20);
	 add(p1);
	 setVisible(true);
 }
@Override
	public void paint(Graphics g)
	{
		g.drawImage(CandyCrustButton.USER_WINDOW,0,0,getWidth(),getHeight(), this);
	}

	public static void main(String[] args)
	{
		new StartWindow("HIGHEST COUNT");

	}
	
	
	

}
