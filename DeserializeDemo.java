package jdbcex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=null;
		try {
			FileInputStream FileIn=new FileInputStream("C:\\Users\\Training\\eclipse-workspace\\Core Java\\Practice/employee.ser");
			ObjectInputStream in=new ObjectInputStream(FileIn);
			e=(Employee) in.readObject();
			in.close();
			FileIn.close();
		}catch(IOException i)
		{
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c)
		{
			System.out.println("employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deseriablized Employee.....");
		System.out.println("Name" +e.name);
		System.out.println("Address" +e.address);
		System.out.println("SSN:" +e.SSN);
		System.out.println("Numer:" +e.number);
	}

}
