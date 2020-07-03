import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class abc extends JFrame implements KeyListener,Runnable
{
	JLabel lbear;
	ImageIcon imbear;
	JLabel []lfruit=new JLabel[7];
	ImageIcon []imfruit=new ImageIcon[7];
	JLabel lscore;
	JButton bquit;
	int score=0;
	int x=100,x1=0,y1=0;
	int i=0;
	Thread t;
 	abc()
	{
		imbear=new ImageIcon("bearbasket.gif");
		lbear=new JLabel(imbear);
		imfruit[0]=new ImageIcon("apple.gif");
		imfruit[1]=new ImageIcon("strawberry.gif");
		imfruit[2]=new ImageIcon("grapes.gif");
		imfruit[3]=new ImageIcon("cherry.gif");
		imfruit[4]=new ImageIcon("plum.gif");
		imfruit[5]=new ImageIcon("banana.gif");
		imfruit[6]=new ImageIcon("pineapple.gif");
		lfruit[0]=new JLabel(imfruit[0]);
		lfruit[1]=new JLabel(imfruit[1]);
		lfruit[2]=new JLabel(imfruit[2]);
		lfruit[3]=new JLabel(imfruit[3]);
		lfruit[4]=new JLabel(imfruit[4]);
		lfruit[5]=new JLabel(imfruit[5]);
		lfruit[6]=new JLabel(imfruit[6]);
		lscore=new JLabel("Score : 0");
		setLayout(null);
		lbear.setBounds(x,550,150,175);
		lfruit[0].setBounds(x1,y1,50,50);
		lscore.setBounds(1050,50,100,40);
		add(lfruit[0]);
		add(lfruit[1]);
		add(lfruit[2]);
		add(lfruit[3]);
		add(lfruit[4]);
		add(lfruit[5]);
		add(lfruit[6]);
		add(lbear);
		add(lscore);
		t=new Thread(this,"fruit");		
		t.start();
		addKeyListener(this);
		setSize(1250,775);
		setVisible(true);
	}
	/*public void paint(Graphics g)
	{
		l1.setBounds(x,100,100,100);
		
	}*/
	public void run()
	{
		Random r=new Random();
			for(int a=0;a<20;a++)
			{
				y1=0;
				x1=r.nextInt(1000);
				
			
			for( ;y1<750; )
			{
				
				y1=y1+5;
				
				lfruit[i].setBounds(x1,y1,50,75);
				lbear.setBounds(x,550,175,175);
				try
				{
					Thread.sleep(20);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				
			
			if(570-y1<=lfruit[i].getHeight() && 540-y1>0 && x1-x<=lbear.getWidth()-60 && x1-x>=25)
			{
				
				lfruit[i].setBounds(0,0,0,0);
				score=score+100;
				lscore.setText("Score :"+score);
				break;
			}
			}
			if(i==6)
			{
				i=0;
			}
			else 
			{
				i++;
			}
	}
	}
	public void keyTyped(KeyEvent ke)
	{
		if(ke.getKeyChar()=='a')
		{
			if(x>0)
			{
				x=x-10;
				//myimg();
			}
		}
		if(ke.getKeyChar()=='d')
		{
			if(x<1065)
			{
				x=x+10;
				//myimg();
			}
		}
		
		lbear.setBounds(x,550,175,175);
	
	}
	public void keyPressed(KeyEvent ke)
	{}
	public void keyReleased(KeyEvent ke)
	{}
	
	/*public void myimg()
	{
		
	}*/	
	public static void main(String arg[])
	{
		abc obj=new abc();
		//obj.myimg();
	}
}