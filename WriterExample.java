package jdbcex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Writer w=new FileWriter("data.txt");
			String content="She sells sea shells in the sea";
			w.write(content);
			w.close();
			System.out.println("Data writter");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
