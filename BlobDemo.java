package jdbcex;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Result;

public class BlobDemo {
	
	Connection con;
	PreparedStatement pstmt;
	Result rs;
	
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
	
	public void writeBlog(int candidateId,String filename)
	{
		String updateSQL="UPDATE candidates "
				+"SET resume =?"
			  +" WHERE id=?";
		try {
			pstmt=con.prepareStatement(updateSQL);
			
			File file=new File(filename);
			FileInputStream input=new FileInputStream(file);
			
			pstmt.setBinaryStream(1, input);
			pstmt.setInt(2,candidateId);
			
			System.out.println("Reading files" +file.getAbsolutePath());
			System.out.println("Store file in the db");
			pstmt.execute();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception is" +e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlobDemo bd1=new BlobDemo();
		bd1.createConnection();
		bd1.writeBlog(133, "johndoe_resume.pdf");
	}

}
