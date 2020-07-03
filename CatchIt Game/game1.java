import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*
<applet code="game1" width=1000 height=500>
</applet>
*/
public class game1 extends Applet implements ActionListener,Runnable
{
	Image im;
	int y1=0;
	Button b1;
	Thread t;
	public void init()
	{
		im=getImage(getCodeBase(),"apple.jpg");
		b1=new Button("image");
		b1.addActionListener(this);
		add(b1);
		t=new Thread(this,"image"); 
		//t.start();
		

	}
	public void paint(Graphics g)
	{
		
		g.drawImage(im,500,y1,this);
		

		
	}
	public void run()
	{
		
		while(y1<475 )
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
	}
	

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t.start();
			
		}
	}
}