import java.awt.*;
import java.awt.event.*;
class a extends Frame implements ActionListener
{
	Button b1;
	Label l1;
	a()
	{
		setLayout(new BorderLayout());
		l1=new Label("This software is a Java product.Copyright Sun Microsystems.");
		b1=new Button("Back");
		add(b1,BorderLayout.SOUTH);
		add(l1,BorderLayout.NORTH);
		b1.addActionListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		new game2();
	}
	public static void main(String arg[])
	{
		new a();
	}
}