package jdbcex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter writer=new FileWriter("name.txt,true");
			BufferedWriter bwr=new BufferedWriter(writer);
			
			bwr.write("James");
			bwr.write("\n");
			bwr.write("Hobert");
			bwr.close();
			
			System.out.println("Successfully written to a file");
		}catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

}
