package candycrust;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;

public class TimePanel extends Panel
{
	JButton b1;
	JLabel l;
	public TimePanel()
	{
		JButton jb=new JButton("GAME STARTED(you only have 60 seconds to get score count)");
		add(jb);
		l=new JLabel("SEC : 0");
		add(l);
		
	}
}
