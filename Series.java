import java.util.Scanner;

public class Series{

public static void main(String args[]){
   System.out.println("Input the first number ");
   Scanner scan = new Scanner(System.in);
   int n=10;
   int i=1,Sum=0;
   while( i<=n)
   {
     Sum=Sum+i;
	 i=i+1;
	}
  System.out.println("Sum is:" +Sum);
  }
 }