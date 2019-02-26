package jdbcex;
import java.sql.*;

public class DemoTransaction {

	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","123456");
		
		System.out.println("Driver is loaded");
		 stmt=con.createStatement();
		con.setAutoCommit(false);
		try {
			int i1=stmt.executeUpdate("insert into candidate_skills values(100,3)");
			int i2=stmt.executeUpdate("update skills set name='Ruby' where id=7" );
			int i3=stmt.executeUpdate("delete from candidates where id=0");
			
			con.commit();
			System.out.println("Transcation is success");
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
