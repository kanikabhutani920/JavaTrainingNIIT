package jdbcex;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		
			fout = new FileOutputStream("f1.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="Sachin";
			byte b[]=s.getBytes();
			bout.write(b);
			
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("success");
	
			// TODO Auto-generated catch block
			
		}
		
		

	}


