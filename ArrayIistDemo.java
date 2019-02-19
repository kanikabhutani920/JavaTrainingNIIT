import java.util.ArrayList;
import java.util.List;

class PlayerList
{
	ArrayList playerArray=new ArrayList();
	List subListObj= new ArrayList();
	


 PlayerList(){
	
   playerArray = new ArrayList();
   subListObj = new ArrayList();
  }
 
 void add() {
	 for(int ctr=0;ctr<5;ctr++)
	 {
		 playerArray.add(new Integer(ctr));
	 }
	 playerArray.add("Martina");
	 playerArray.add("Serena");
	 playerArray.add("venus");
	 playerArray.add("Martina");
	 System.out.println();
 }
 
 void search()
 {
	 System.out.println();
	 System.out.println("***************************************************************");
	 System.out.println("Search for an object and return " + "the first and lat position");
	 System.out.println("###############################################################");
	 System.out.println();
	 System.out.println("First occurance of the string " + "\"Serena\" is at position " + playerArray.indexOf("Serena"));
	 System.out.println("Last Occurance of the string " + "\"Serena\" is at postion" + playerArray.lastIndexOf("Serena"));
	 System.out.println();
 }
 
 void display()
 {
	 System.out.println("**************************************************************");
	 System.out.println("reteriving objects from array list");
	 System.out.println("**************************************************************");
	 System.out.println();
	 for(int ctr=0;ctr<playerArray.size();ctr++)
	 {
		 System.out.println(" "+ playerArray.get(ctr));
	 }
 }
 
 void extract()
 {
	 System.out.println("###################################################################");
	 System.out.println("Extract a sublist and " + "then print the new List");
	 System.out.println();
	 subListObj=playerArray.subList(5, playerArray.size());
	 System.out.println("New Sub-List from index 5 to" +playerArray.size() + "is :" +subListObj);
	 System.out.println();
 }
}


public class ArrayIistDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   PlayerList Obj = new PlayerList();
   Obj.add();
   Obj.search();
   Obj.display();
   Obj.extract();
	}

}
