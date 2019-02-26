package jdbcex;
import java.sql.*;

//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;

public class BatchDemo {

	Connection con;
	Statement stmt;
	ResultSet rs;
	
	BatchDemo()
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
	
	void createBatch() throws SQLException 
	{
		con.setAutoCommit(false);
		stmt=con.createStatement();
	      stmt.addBatch("insert into skills(name) values('Spring')");
	      stmt.addBatch("update skills set name='Web Application' where id=4;");
	      stmt.addBatch("delete from skills where id=6;");
	      
	      
	
	
	try {
		int i[]=stmt.executeBatch();
		con.commit();
		System.out.println("batch is successfully executed");
	}
	catch(Exception e)
	{
		con.rollback();
	   System.out.println(e);
	
	}
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		BatchDemo bd=new BatchDemo();
		bd.createConnection();
		bd.createBatch();

	}

}
