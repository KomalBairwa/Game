import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class scorepg extends JFrame implements ActionListener
{
	JLabel l1,lsc;
	JButton bback;
	ImageIcon iml,imb;
	
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	
	scorepg(int score)
	{
		int msc=0,c=0;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:datasource1","root","root"); //odbc data source administrator
			ps=con.prepareStatement("select min(score) from hscoretb");
			rs=ps.executeQuery();
			while(rs.next())
			{
			msc=rs.getInt(1);
			}
			ps=con.prepareStatement("select count(*) from hscoretb");
			rs=ps.executeQuery();
			while(rs.next())
			{
				c=rs.getInt(1);
			}
			
			if((msc<score && score>0)|| c<5)
			{
				String nm=JOptionPane.showInputDialog(this,"Enter Name :","Congratulations ! High Score.",JOptionPane.INFORMATION_MESSAGE);
				nm.trim();
				if(nm.length()>9)
				{
					nm=nm.substring(0,9);
				}
				if(nm!=null)
				{
					if(c==5)
					{
					ps=con.prepareStatement("delete from hscoretb where score="+msc);
					ps.executeUpdate();
					con.close();
					}
					con=DriverManager.getConnection("jdbc:odbc:datasource1","root","root");
			
					ps=con.prepareStatement("insert into hscoretb values(?,?)");
					ps.setString(1,nm);
					ps.setInt(2,score);
					ps.executeUpdate();
				}		
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		iml=new ImageIcon("scorepg.gif");
		l1=new JLabel(iml);
		imb=new ImageIcon("back2main.gif");
		bback=new JButton(imb);
		lsc=new JLabel(score+"");
		bback.addActionListener(this);
		setLayout(null);
		l1.setBounds(0,0,1250,775);
		bback.setBounds(530,500,120,50);
		lsc.setFont(new java.awt.Font("Berlin Sans FB Demi",0,72));
		lsc.setBounds(530,400,200,75);
		add(lsc);
		add(l1);
		add(bback);
		
		setSize(1250,775);
		setVisible(true);		

		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bback)
		{
			new gamepg1();
			setVisible(false);
		}
	}
	public static void main(String arg[])
	{
		new scorepg(0);
	}
}