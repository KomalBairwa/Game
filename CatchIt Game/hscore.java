import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

	
public class hscore extends JFrame implements ActionListener
{
	JLabel []lhs=new JLabel[5];
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	Object [][]rw=new Object[5][3];
	ImageIcon imbk;
	JLabel lbk;
	
	hscore()
	{	
		imbk=new ImageIcon("hscorepg.gif");
		lbk=new JLabel(imbk);
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:datasource1","root","root");
			ps=con.prepareStatement("select * from hscoretb");
			System.out.println(con);
			rs=ps.executeQuery();
			int r=0,c=0;
			while(rs.next())
			{
				
				rw[r][0]=rs.getInt(1);
				rw[r][1]=rs.getString(2);
				rw[r][2]=rs.getInt(3);
				if(rw[r][0]!=null)
				{
				lhs[r].setText(rw[r][0]+"          "+rw[r][1]+"          "+rw[r][2]);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
			setLayout(null);
			lbk.setBounds(0,0,1250,775);
			lhs[0].setBounds(500,500,100,30);
			lhs[1].setBounds(500,540,100,30);
			lhs[2].setBounds(500,580,100,30);
			lhs[3].setBounds(500,620,100,30);
			lhs[4].setBounds(500,660,100,30);
			for(int i=0;i<5;i++)
			{
				add(lhs[i]);
			}
			add(lbk);
		setSize(1250,775);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	public static void main(String arg[])
	{
		new hscore();
	}
}

		