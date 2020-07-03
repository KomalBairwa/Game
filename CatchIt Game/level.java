import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class level extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel lbk;
	ImageIcon bk,beg,adv;
	level()
	{
		bk=new ImageIcon("levelbk.gif");
		beg=new ImageIcon("big.gif");
		adv=new ImageIcon("adv.gif");
		lbk=new JLabel(bk);
		b1=new JButton(beg);
		b2=new JButton(adv);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(null);
		b1.setBounds(520,300,200,50);
		b2.setBounds(520,400,200,50);
		lbk.setBounds(0,0,1250,775);
		add(lbk);
		add(b1);
		add(b2);
		
		setSize(1250,775);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			new finalgame(20);
		}
		if(ae.getSource()==b2)
		{
			new finalgame(10);
		}
		setVisible(false);
	}
	public static void main(String arg[])
	{
		new level();
	}
}