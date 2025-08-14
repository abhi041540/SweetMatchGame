package candycrust;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ResultPanel extends Panel
{
	JButton jb; String an;
	public ResultPanel(long a)
	{
		setLayout(new BorderLayout());
	    an=String.valueOf(a);
	jb=new JButton(new ImageIcon(CandyCrustButton.RESULT_BUTTON));
	jb.setText(an);
	jb.setFont(new Font("Arial",Font.BOLD,70));
	
	jb.setHorizontalTextPosition(SwingConstants.CENTER);
	add(jb);
	
	}

}
