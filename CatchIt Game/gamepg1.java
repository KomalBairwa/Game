import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gamepg1 extends JFrame implements ActionListener
{
	
	JLabel lbck;
	JButton bng,bhs,bgc,be;
	ImageIcon imng,imhs,imgc,imex,imbck;
	gamepg1()
	{
		
		
		imng=new ImageIcon("newgame.jpg");
		imgc=new ImageIcon("gamectrl.jpg");
		imhs=new ImageIcon("hs.jpg");
		imex=new ImageIcon("exit.jpg");
		imbck=new ImageIcon("Forestpg1.jpg");
		lbck=new JLabel(imbck);
		bng=new JButton(imng);
		bhs=new JButton(imhs);
		bgc=new JButton(imgc);
		be=new JButton(imex);
		
		setLayout(null);
		bng.setBounds(235,360,230,60);
		lbck.setBounds(0,0,1300,775);
		add(lbck);
		add(bng);
		bng.addActionListener(this);
		bgc.setBounds(235,425,230,60);
		add(bgc);		
		bgc.addActionListener(this);
		bhs.setBounds(235,490,230,60);
		add(bhs);
		bhs.addActionListener(this);
		be.setBounds(235,555,230,60);
		add(be);
		be.addActionListener(this);
		
		setSize(1250,775);
		setTitle("Game");
		setVisible(true);
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bng)
		{
			new level();
		}
		if(ae.getSource()==bhs)
		{
			new hscore1();
		}
		if(ae.getSource()==bgc)
		{
			new gamectrl();
		}
		
		setVisible(false);
	}
	public static void main(String arg[])
	{
		new gamepg1();
		
	}
}