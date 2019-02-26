package jdbcex;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.mysql.cj.jdbc.CallableStatement;
import java.sql.*;

public class CallableDemo {
	
	Connection con;
	CallableStatement cstmt;
	ResultSet rs;
	
	CallableDemo()
	{
		
	}
	
	void createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","123456");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getSkills(int candidateId)
	{
		String query="{call get_candidate_skill(?)}";
		ResultSet rs;
		
		try {
			CallableStatement stmt= con.prepareCall(query);
			stmt.setInt(1, candidateId);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(String.format("%s - %s" , rs.getString("first_name") + " " +rs.getString("last_name")," "+rs.getString("skill")));
	
			}
		}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallableDemo cd1=new CallableDemo();
		cd1.createConnection();
		cd1.getSkills(133);

	}

}
