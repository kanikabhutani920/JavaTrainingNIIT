import java.util.Scanner;

public class Oddeven{

public static void main(String args[]){
   System.out.println("Input the first number ");
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
 
     if(n%2==0)
	 {
	   System.out.println("Number is even");
	 }
	 else
	 {
	    System.out.println("Number is odd");
	  }
	  
	}
}