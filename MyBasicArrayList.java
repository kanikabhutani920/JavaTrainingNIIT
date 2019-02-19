import java.util.ArrayList;
import java.util.Collections;

public class MyBasicArrayList {
	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
	    al.add("C++");
	    al.add("Java");
	    al.add("C");
	    al.add("Phython");
	    System.out.println(al);
	    
	    System.out.println("Element at index1:" +al.get(1));
	    System.out.println("Does list contains JAVA?" +al.contains("Java"));
	    
	    al.add(2,"PLAY");
	    System.out.println(al);
	    System.out.println("Is arrayList empty??" +al.isEmpty());
	    System.out.println("Index of C is" +al.indexOf("C"));
	    System.out.println("Size of the arrayList i:" +al.size());
	    Collections.sort(al);
	    System.out.println(al);

	}

}
