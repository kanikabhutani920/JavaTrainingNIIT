package jdbcex;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","123456");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from employees");
			while(rs.next())
			
				System.out.println(rs.getInt(1)+ " * "+ rs.getString(2) +" ----    "+ rs.getString(3) + "    -------->    " +rs.getString(5));
				con.close();
		}catch (Exception e)
			{
				System.out.println(e);
			}
		}

	}


