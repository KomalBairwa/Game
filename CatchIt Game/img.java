import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class img extends JFrame implements KeyListener
{
	JLabel l1;
	ImageIcon im;
	int x=0;
	img()
	{
		im=new ImageIcon("bearbasket.jpg");
		l1=new JLabel(im);
		
		//setLayout(null);
		//l1.setBounds(0,200,175,175);
		add(l1);
		
		setSize(600,600);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		//l1.setBounds(x,200,175,175);
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
		new img();
	}
}	