package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection con;
		
		ResultSet rs;
		
		int cnt=0;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.jdbc.Driver
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","123456");
				String str="insert into offices values(8,'Banglore','999999999','mg road','utility building','ka','INDIA','56000','NA')";
				Statement stmt=con.createStatement();
				
				int rowcount=stmt.executeUpdate(str);
				if(rowcount>0)
				{
					System.out.println("Record Inserted succesfully");
				}
				String str1="select Count(officecode) from offices";
				rs=stmt.executeQuery(str1);
				
				while(rs.next())
				{
					cnt=rs.getInt(1);
					System.out.println("Total no. of records is:"+cnt);
					
				}
				con.close();
		}catch(Exception e)
			{
			   System.out.println(e);
			}

	}

}
