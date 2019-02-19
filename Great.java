import java.util.Scanner;

public class Great{

public static void main(String args[]){
   System.out.println("Input the first number ");
   Scanner scan = new Scanner(System.in);
   int n1 = scan.nextInt();
   System.out.println("Input the second number ");
   int n2 = scan.nextInt();
   System.out.println("Input the third number ");
   int n3 = scan.nextInt();

   
   if( n1>n2 && n1>n3) 
   { 
      System.out.println("n1 is greatest");
   }
   else if( n2>n1 && n2>n3)
   {
      System.out.println("n2 is greatest");
   }
   else 
   {
      System.out.println("n3 is greatest");
   }
  }
 }