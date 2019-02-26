package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlCon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","123456");
			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs=stmt.executeQuery("select * from customers where city='NYC'");
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+ " * "+ rs.getString(2) +" ----    "+ rs.getString(3) + "    -------->    " +rs.getString(5) + "   ----->    " +rs.getString(8));
			}
			System.out.println("***********************************************");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+"        " +rs.getString(2));
			System.out.println("***********************************************");
			rs.relative(-2);
			System.out.println(rs.getInt(1)+"        " +rs.getString(2));
			System.out.println("************************************************");
			int i=rs.getRow();
			
			System.out.println("cursor position"+i);
			rs.close();
			stmt.close();
			con.close();
		}catch (Exception e)
			{
				System.out.println(e);
			}
		}

	}

