package jdbcex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamRoFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream is=new FileInputStream("D:\\kanika\\kakak\\file.txt");
			OutputStream os=new FileOutputStream("D:\\kanika\\kakak\\file1.txt");
			
			byte[] buffer = new byte[1024];
			int bytesRead;
			while((bytesRead=is.read(buffer))!=-1)
			{
				os.write(buffer,0,bytesRead);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

