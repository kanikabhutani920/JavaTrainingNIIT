import java.util.Scanner;

public class Breakdemoo{

public static void main(String args[]){
   System.out.println("Input the number ");
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int sum=0;
    for(int i=0;i<n;i++)
	{
	 int k = scan.nextInt();
	  if(k<0)
	  { 
	    System.out.println("Please enter a postive number!!");
		break;
		
	   }
	   else
	   {
	     //System.out.println("The number is:");
		sum=sum+k;  
		}
	}
  // sum=sum+n;
   System.out.println("the sum is" +sum);
 }
}