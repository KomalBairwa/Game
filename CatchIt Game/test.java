import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.util.*;

/*
<applet code="game" width=1000 height=650>
</applet>
*/

public class test extends JFrame implements ActionListener,KeyListener,Runnable
{
	ImageIcon imbear;
	ImageIcon []imfruit=new ImageIcon[7];
	JLabel lfruit;
	JLabel lbear;
	JButton bstart,bexit;
	int x=450;
	int i=0;
	int x1=500,y1=0;
	Thread t;
	test()
	{
		imbear=new ImageIcon("bearbasket.jpg");
		imfruit[0]=new ImageIcon("apple.jpg");
		imfruit[1]=new ImageIcon("strawberry copy.gif");
		imfruit[2]=new ImageIcon("grapes.jpg");
		imfruit[3]=new ImageIcon("cherry.jpg");
		imfruit[4]=new ImageIcon("plum.jpg");
		imfruit[5]=new ImageIcon("banana.jpg");
		imfruit[6]=new ImageIcon("pineapple.jpg");
		lbear=new JLabel(imbear);
		lfruit=new JLabel(imfruit[0]);
		 bstart=new JButton("Start");
		 bexit=new JButton("Exit");
		t=new Thread(this,"image");
		//t.start();
		bstart.addActionListener(this);
		addKeyListener(this);

		setLayout(null);
		bstart.setBounds(400,650,100,50);
		bexit.setBounds(600,600,100,50);
		lbear.setBounds(x,500,150,180);
		lfruit.setBounds(x1,y1,50,75);
		add(bstart);	
		add(bexit);
		add(lbear);
		add(lfruit);
		setSize(1000,650);
		setVisible(true);
		
		
	}
	public void update(Graphics g)
	{
		//lfruit=new JLabel(imfruit[i]);
		//lfruit.setBounds(x1,y1,50,75);
		lbear.setBounds(x,500,150,180);
		//add(lfruit);
		//add(lbear);
		//g.drawImage(imfruit[i],x1,y1,this);
	
		
		
	}
	
	public void run()
	{
			Random r=new Random();
			for(int a=0;a<20;a++)
			{
				y1=0;
				x1=r.nextInt(1000);
			
			for( ;y1<650; )
			{
				
				y1=y1+5;
				repaint();
				try
				{
					Thread.sleep(50);
				}
				catch(Exception e)
				{
					System.out.println(e);
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
	public void actionPerformed(ActionEvent ae)
	{
		/*if(ae.getSource()==bstart)
		{
			t.start();
		}*/
	}
	public void keyTyped(KeyEvent ke)
	{

		System.out.println(ke.getKeyChar());
		if(ke.getKeyChar()=='a')
		{
			if(x>5)
			{
				x=x-5;
				repaint();
			}	
		}
		else if(ke.getKeyChar()=='d')
		{
			if(x<995)
			{
				x=x+5;
				repaint();
			}
		}
		
		
	}
	public void keyPressed(KeyEvent ke)
	{
		
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public static void main(String arg[])
	{
		new game();
	}
	
}	
		