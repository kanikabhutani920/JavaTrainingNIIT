package jdbcex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.name="M....";
		e.address="M";
		e.SSN=111111;
		e.number=101;
		
		try {
			FileOutputStream fileOut=new FileOutputStream("C:\\Users\\Training\\eclipse-workspace\\Core Java\\Practice/employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /tmp/employee.ser");
		}catch(IOException i)
		{
			i.printStackTrace();
			//System.out.println(i);
		}

	}

}
