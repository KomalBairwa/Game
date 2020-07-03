import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class hscore1 extends JFrame implements ActionListener
{
	JLabel []lhs=new JLabel[5];
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	Object [][]rw=new Object[5][2];
	ImageIcon imbk,imbb;
	JLabel lbk;
	JButton bk;
	hscore1()
	{
		lhs[0]=new JLabel("");
		lhs[1]=new JLabel("");
		lhs[2]=new JLabel("");
		lhs[3]=new JLabel("");
		lhs[4]=new JLabel("");
		imbk=new ImageIcon("hscorepg.gif");
		lbk=new JLabel(imbk);
		imbb=new ImageIcon("hsbck.gif");
		bk=new JButton(imbb);
		bk.addActionListener(this);
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:datasource1","root","root");
			ps=con.prepareStatement("select * from hscoretb order by Score desc");
			rs=ps.executeQuery();
			int r=0,s=0;
			while(rs.next())
			{
				String s1=rs.getString(1);
				String s2=rs.getInt(2)+"";
				//rw[r][0]=rs.getString(1);
				//rw[r][1]=rs.getInt(2);
				s=r+1;
				//System.out.println(s1.length());
				//System.out.println(s2.length());
				if(s1.length()<10)
				{
					while(s1.length()<10)
					{
						s1=s1+"          ";
						//System.out.println(s1+".");
					}
				}
				
				rw[r][0]=s1;
				rw[r][1]=s2;
				lhs[r].setText(""+s+".    "+s1+""+s2);
				r++;
			
			}
			
			
			
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setLayout(null);
		lbk.setBounds(0,0,1250,775);
		bk.setBounds(570,500,130,40);
		lhs[0].setFont(new java.awt.Font("Berlin Sans FB Demi",0,24));
		lhs[1].setFont(new java.awt.Font("Berlin Sans FB Demi",0,24));
		lhs[2].setFont(new java.awt.Font("Berlin Sans FB Demi",0,24));
		lhs[3].setFont(new java.awt.Font("Berlin Sans FB Demi",0,24));
		lhs[4].setFont(new java.awt.Font("Berlin Sans FB Demi",0,24));
		lhs[0].setBounds(500,310,300,25);
		lhs[1].setBounds(500,350,300,25);
		lhs[2].setBounds(500,390,300,25);
		lhs[3].setBounds(500,430,300,25);
		lhs[4].setBounds(500,470,300,25);
		add(lhs[0]);
		add(lhs[1]);
		add(lhs[2]);
		add(lhs[3]);
		add(lhs[4]);		
		add(bk);
		add(lbk);
		setSize(1250,775);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bk)
		{
			new gamepg1();		
			setVisible(false);
		}
	}
	public static void main(String arg[])
	{
		new hscore1();
	}
}