package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();
		v.add("umesh");
		v.addElement("john");
		v.addElement("kumar");

	
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
