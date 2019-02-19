import java.util.Scanner;

public class loops{

public static void main(String args[]){
   System.out.println("Input the first number ");
   Scanner scan = new Scanner(System.in);
   int n1 = scan.nextInt();
  
  while(n1>0)
  {
     System.out.println(n1);
	 n1--;
  }
 }
}