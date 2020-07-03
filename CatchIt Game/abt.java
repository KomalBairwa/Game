import java.awt.*;
import java.awt.event.*;
class abt extends Frame implements ActionListener
{
	Button b1;
	Label l1;
	abt()
	{
		setLayout(new BorderLayout());
		l1=new Label("This software is a Java product.Copyright Sun Microsystems.");
		b1=new Button("Back");
		add(b1,BorderLayout.SOUTH);
		add(l1,BorderLayout.NORTH);
		b1.addActionListener(this);
		setSize(1250,775);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new gamepg1();
	}
	public static void main(String arg[])
	{
		new abt();
	}
}