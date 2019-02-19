import java.util.Scanner;
class Diamonddemo{

  public static void main(String args[]){
   
    System.out.println("Enter Odd numbers of lines");
	Scanner scan=new Scanner(System.in);
	
	int lines=scan.nextInt();
	int mid=(lines+1)/2;
	
	//upper 
	
	for(int i=0;i<mid;i++)
	{
	  
	
	//Space
	
	for(int j=0;j<(mid-1);j++)
	{
	   System.out.print(" ");
	}
	
	//star
	for(int k=0;k<(i*2-1);k++)
	{
		System.out.print("*");
	}
	System.out.println();
  }
  
  
  //lower
  for(int i=1;i<=(mid-1);i++)
  {
    //space
	for(int j=1;j<i;j++)
	{
	    System.out.print(" ");
	}
	//star
	for(int k=1;k<=2*(mid-1);k++)
	{
		System.out.println("*");
	}
   }
  }
}