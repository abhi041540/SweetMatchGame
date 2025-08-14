package candycrust;


import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class WinnerWindow extends JFrame
{
	ImageIcon im;
	public WinnerWindow(long a)
 {
	 im=new ImageIcon(CandyCrustButton.RESULT_BUTTON);
	 setVisible(true);
	 setLocationRelativeTo(this);
	 setSize(Toolkit.getDefaultToolkit().getScreenSize());
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setLayout(null);
	 Panel p=new ResultPanel(a);
	 p.setBounds(423,86,im.getIconWidth()-20,im.getIconHeight());
	 add(p);
//	 addMouseListener(new MouseAdapter() {
//		 @Override
//		 public void mouseClicked(MouseEvent me)
//		 {
//			 System.out.println(me.getX()+","+me.getY());
//		 }
//	 });
 }
 @Override
 public void paint(Graphics g)
 {
	 g.drawImage(CandyCrustButton.WINNERWINDOW_BACKGROUND, 0, 0, getWidth(), getHeight(), this);
 }
}
