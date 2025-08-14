package candycrust;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonPanel extends Panel implements ActionListener
{
	JButton jb;
	ImageIcon ie;
	Frame f;
	Font fon;
	 public ButtonPanel(Frame f)
     {
		 fon=new Font("Arial",Font.BOLD,20);
		 this.f=f;
		 setLayout(new BorderLayout());
    	 ie=new ImageIcon(CandyCrustButton.PLAY_BUTTON);
    	 jb=new JButton(ie);
    	 jb.setFont(fon);
    	 jb.setPreferredSize(new Dimension(ie.getIconWidth(),ie.getIconHeight()));
    	 add(BorderLayout.CENTER,jb);
    	 jb.addActionListener(this);
    	 
     }
	@Override
	public void actionPerformed(ActionEvent e)
	{
	   new GameFrame();
	   f.dispose();
		
	}
}
