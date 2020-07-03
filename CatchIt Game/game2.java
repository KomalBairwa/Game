import java.awt.*;
import java.awt.event.*;
public class game2 extends Frame implements ActionListener
{
	Label l1;
	Button bng,bhs,bgc,ba,be;
	game2()
	{
		setLayout(new GridLayout(6,2));
		l1=new Label("CATCH IT");
		bng=new Button("New Game");
		bhs=new Button("Highest Scores");
		bgc=new Button("Game Controls");
		ba=new Button("About");
		be=new Button("Exit");
		add(l1);
		add(bng);
		bng.addActionListener(this);
		add(bhs);
		bhs.addActionListener(this);
		add(bgc);		
		bgc.addActionListener(this);
		add(ba);
		ba.addActionListener(this);
		add(be);
		be.addActionListener(this);
		setSize(500,500);
		setTitle("Game");
		setVisible(true);
	}	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bng)
		{
			new a();
		}
		/*if(ae.getSource()==bhs)
		{
			new pg2();
		}*/
		if(ae.getSource()==bgc)
		{
			new gamectrl();
		}
		
		if(ae.getSource()==ba)
		{
			new abt();
		}
	}
	public static void main(String arg[])
	{
		new game2();
	}
}