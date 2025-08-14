package candycrust;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class GamePanel extends Panel implements ActionListener
{
	JFrame f; JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bb,bc,bd,be,bf,bg ,sb;
	ImageIcon im; int a[][]=new int[4][4],n=0;long ans=0;
	JButton ub1,ub2;
	int r1,r2,c1,c2,sec=0;
    Timer t;
	TimePanel tp;
	Font fon;
    public GamePanel(JFrame f,TimePanel tp)
    {
    	this.tp=tp;
    	this.f=f;


    	for(int i=0;i<=3;i++)
    	{
    		for(int j=0;j<=3;j++)
    		{
    			a[i][j]=2;
    		}
    	}
    	setLayout(new GridLayout(4,4,10,10));
    	 fon=new Font("Arial",Font.BOLD,20);
    	im=new ImageIcon(CandyCrustButton.BUTTON_ICON);
    	b1=new JButton("2",im);
    	b1.setFont(fon);
    	b1.setHorizontalTextPosition(SwingConstants.CENTER);
    	b2=new JButton("2",im);
    	b2.setFont(fon);
    	b2.setHorizontalTextPosition(SwingConstants.CENTER);
    	b3=new JButton("2",im);
    	b3.setFont(fon);
    	b3.setHorizontalTextPosition(SwingConstants.CENTER);
    	b4=new JButton("2",im);
    	b4.setFont(fon);
    	b4.setHorizontalTextPosition(SwingConstants.CENTER);
    	b5=new JButton("2",im);
    	b5.setFont(fon);
    	b5.setHorizontalTextPosition(SwingConstants.CENTER);
    	b6=new JButton("2",im);
    	b6.setFont(fon);
    	b6.setHorizontalTextPosition(SwingConstants.CENTER);
    	b7=new JButton("2",im);
    	b7.setFont(fon);
    	b7.setHorizontalTextPosition(SwingConstants.CENTER);
    	b8=new JButton("2",im);
    	b8.setFont(fon);
    	b8.setHorizontalTextPosition(SwingConstants.CENTER);
    	b9=new JButton("2",im);
    	b9.setFont(fon);
    	b9.setHorizontalTextPosition(SwingConstants.CENTER);
    	ba=new JButton("2",im);
    	ba.setFont(fon);
    	ba.setHorizontalTextPosition(SwingConstants.CENTER);
    	bb=new JButton("2",im);
    	bb.setFont(fon);
    	bb.setHorizontalTextPosition(SwingConstants.CENTER);
    	bc=new JButton("2",im);
    	bc.setFont(fon);
    	bc.setHorizontalTextPosition(SwingConstants.CENTER);
    	bd=new JButton("2",im);
    	bd.setFont(fon);
    	bd.setHorizontalTextPosition(SwingConstants.CENTER);
    	bf=new JButton("2",im);
    	bf.setFont(fon);
    	bf.setHorizontalTextPosition(SwingConstants.CENTER);
    	be=new JButton("2",im);
    	be.setFont(fon);
    	be.setHorizontalTextPosition(SwingConstants.CENTER);
    	bg=new JButton("2",im);
    	bg.setFont(fon);
    	bg.setHorizontalTextPosition(SwingConstants.CENTER);
    	add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(ba);
    	add(bb);add(bc);add(bd);add(be);add(bf);add(bg);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b5.addActionListener(this);
    	b6.addActionListener(this);
    	b7.addActionListener(this);
    	b8.addActionListener(this);
    	b9.addActionListener(this);
    	ba.addActionListener(this);
    	bb.addActionListener(this);
    	bc.addActionListener(this);
    	bd.addActionListener(this);
    	be.addActionListener(this);
    	bf.addActionListener(this);
    	bg.addActionListener(this);
    	t = new Timer(1000,new ActionListener()
    			{
    		 @Override
    		 public void actionPerformed(ActionEvent ae)
    		 {
    			 sec+=1;
    			tp.l.setText("SEC : "+sec);
    			 int i,j,bc2;
    			 for(i=3;i>=0;i--)
    			 {
    				 for(j=0;j<=3;j++)
    				 {
    					 if(a[i][j]==0 && (i!=0))
    					 {
    						 int ci=i,m=0;
    						 for(;m!=1;)
    						 {
    							 ci-=1;
    							 if(ci<0)
    							 {
    								 m=1;
    								 break;
    							 }
    							 if(a[ci][j]!=0)
    							 {
    								 a[i][j]=a[ci][j];
    								 a[ci][j]=0;
    								 bc2=((ci*4)+(j+1));
    								 int bc1=((i*4)+(j+1));
    								 
    								 if(bc2==1)
    								 {
    									 ub1=b1;
    								 }
    								 else if(bc2==2)
    								 {
    									 ub1=b2;
    								 }
    								 else if(bc2==3)
    								 {
    									 ub1=b3;
    								 }
    								 else if(bc2==4)
    								 {
    									 ub1=b4;
    								 }
    								 else if(bc2==5)
    								 {
    									 ub1=b5;
    								 }
    								 else if(bc2==6)
    								 {
    									 ub1=b6;
    								 }
    								 else if(bc2==7)
    								 {
    									 ub1=b7;
    								 }
    								 else if(bc2==8)
    								 {
    									 ub1=b8;
    								 }
    								 else if(bc2==9)
    								 {
    									 ub1=b9;
    								 }
    								 else if(bc2==10)
    								 {
    									 ub1=ba;
    								 }
    								 else if(bc2==11)
    								 {
    									 ub1=bb;
    								 }
    								 else if(bc2==12)
    								 {
    									 ub1=bc;
    								 }
    								 else if(bc2==13)
    								 {
    									 ub1=bd;
    								 }
    								 else if(bc2==14)
    								 {
    									 ub1=be;
    								 }
    								 else if(bc2==15)
    								 {
    									 ub1=bf;
    								 }
    								 else if(bc2==16)
    								 {
    									 ub1=bg;
    								 }
    								 if(bc1==1)
    								 {
    									 ub2=b1;
    								 }
    								 else if(bc1==2)
    								 {
    									 ub2=b2;
    								 }
    								 else if(bc1==3)
    								 {
    									 ub2=b3;
    								 }
    								 else if(bc1==4)
    								 {
    									 ub2=b4;
    								 }
    								 else if(bc1==5)
    								 {
    									 ub2=b5;
    								 }
    								 else if(bc1==6)
    								 {
    									 ub2=b6;
    								 }
    								 else if(bc1==7)
    								 {
    									 ub2=b7;
    								 }
    								 else if(bc1==8)
    								 {
    									 ub2=b8;
    								 }
    								 else if(bc1==9)
    								 {
    									 ub2=b9;
    								 }
    								 else if(bc1==10)
    								 {
    									 ub2=ba;
    								 }
    								 else if(bc1==11)
    								 {
    									 ub2=bb;
    								 }
    								 else if(bc1==12)
    								 {
    									 ub2=bc;
    								 }
    								 else if(bc1==13)
    								 {
    									 ub2=bd;
    								 }
    								 else if(bc1==14)
    								 {
    									 ub2=be;
    								 }
    								 else if(bc1==15)
    								 {
    									 ub2=bf;
    								 }
    								 else if(bc1==16)
    								 {
    									 ub2=bg;
    								 }
    								 
    								 ub1.setText(null);
    								 ub2.setText(String.valueOf(a[i][j]));
    								 m=1;
    								 break;
    								 
    								 
    							 }
    						 }
    					 }
    				 }
    			 }
    			 for(i=0;i<=3;i++)
    			 {
    				 if(a[0][i]==0)
    				 {
    					 a[0][i]=2;
    					 int frb=i+1;
    					 if(frb==1)
    					 {
    						 b1.setText("2");
    					 }
    					 else if(frb==2)
    					 {
    						 b2.setText("2");
    					 }
    					 else if(frb==3)
    					 {
    						 b3.setText("2");
    					 }
    					 else if(frb==4)
    					 {
    						 b4.setText("2");
    					 }
    				 }
    			 }
    			 
    			 if(sec==60)
    			 {
    				 for( i=0;i<=3;i++)
     		    	{
     		    		for( j=0;j<=3;j++)
     		    		{
     		    			if(a[i][j]>ans)
     		    			{
     		    				ans=a[i][j];
     		    			}
     		    		}
     		    	}
    				 t.stop();
    				 f.dispose();
    				 new WinnerWindow(ans);
    				 
    		     }
    		 }
    	});
    	if(sec==0)
		 {
			 t.start();
		 }
		 
    }
	@Override
	public void actionPerformed(ActionEvent e) 
	{ 
		if(n==0)
		{
			sb=(JButton) e.getSource();
			n=1;
			if(sb==b1)
			{
				r1=0;
				c1=0;
			}
			else if(sb==b2) 
			{
				r1=0;
				c1=1;
			}
			else if(sb==b3) 
			{
				r1=0;
				c1=2;
			}
			else if(sb==b4) 
			{
				r1=0;
				c1=3;
			}
			else if(sb==b5) 
			{
				r1=1;
				c1=0;
			}
			else if(sb==b6) 
			{
				r1=1;
				c1=1;
			}
			else if(sb==b7) 
			{
				r1=1;
				c1=2;
			}
			else if(sb==b8) 
			{
				r1=1;
				c1=3;
			}
			else if(sb==b9) 
			{
				r1=2;
				c1=0;
			}
			else if(sb==ba) 
			{
				r1=2;
				c1=1;
			}
			else if(sb==bb) 
			{
				r1=2;
				c1=2;
			}
			else if(sb==bc) 
			{
				r1=2;
				c1=3;
			}
			else if(sb==bd) 
			{
				r1=3;
				c1=0;
			}
			else if(sb==be) 
			{
				r1=3;
				c1=1;
			}
			else if(sb==bf) 
			{
				r1=3;
				c1=2;
			}
			else if(sb==bg) 
			{
				r1=3;
				c1=3;
			}
			
		}
		else if(n==1)
		{
			JButton sb1=(JButton)(e.getSource());
			n=0;
			if(sb1==b1)
			{
				r2=0;
				c2=0;
			}
			else if(sb1==b2) 
			{
				r2=0;
				c2=1;
			}
			else if(sb1==b3) 
			{
				r2=0;
				c2=2;
			}
			else if(sb1==b4) 
			{
				r2=0;
				c2=3;
			}
			else if(sb1==b5) 
			{
				r2=1;
				c2=0;
			}
			else if(sb1==b6) 
			{
				r2=1;
				c2=1;
			}
			else if(sb1==b7) 
			{
				r2=1;
				c2=2;
			}
			else if(sb1==b8) 
			{
				r2=1;
				c2=3;
			}
			else if(sb1==b9) 
			{
				r2=2;
				c2=0;
			}
			else if(sb1==ba) 
			{
				r2=2;
				c2=1;
			}
			else if(sb1==bb) 
			{
				r2=2;
				c2=2;
			}
			else if(sb1==bc) 
			{
				r2=2;
				c2=3;
			}
			else if(sb1==bd) 
			{
				r2=3;
				c2=0;
			}
			else if(sb1==be) 
			{
				r2=3;
				c2=1;
			}
			else if(sb1==bf) 
			{
				r2=3;
				c2=2;
			}
			else if(sb1==bg) 
			{
				r2=3;
				c2=3;
			}
			
			if(a[r1][c1]==a[r2][c2])
			{
				if((Math.abs((r1-r2))+Math.abs((c1-c2)))==1)
				{
					a[r2][c2]=a[r2][c2]+a[r1][c1];
					a[r1][c1]=0;
					String un=String.valueOf(a[r2][c2]);
					sb.setText(null);
					sb1.setText(un);
				}
			}
		}
		
	}
}
