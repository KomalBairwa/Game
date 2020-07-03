import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gamectrl extends JFrame implements ActionListener
{
	
	JLabel lbck;
	JButton bck;
	ImageIcon imbck,bck1;
	gamectrl()
	{
	
	
	imbck=new ImageIcon("gamectrlbckt.jpg");
	lbck=new JLabel(imbck);
	bck1=new ImageIcon("bck.jpg");
	bck=new JButton(bck1);
	
	setLayout(null);
	lbck.setBounds(0,0,1250,775);
	bck.setBounds(490,490,130,40);
	
	add(bck);
	add(lbck);
	bck.addActionListener(this);
	setSize(1250,775);
	setVisible(true);
	}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==bck)
	{
		new gamepg1();
		setVisible(false);
	}
}
public static void main(String arg[])
{
	new gamectrl();
}
}