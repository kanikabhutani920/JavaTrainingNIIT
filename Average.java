import java.util.Scanner;

public class Average{

public static void main(String args[]){
   System.out.println("Input the first number to add");
   Scanner scan = new Scanner(System.in);
   int n1 = scan.nextInt();
   System.out.println("Input the second number to add");
   int n2 = scan.nextInt();
   System.out.println("Input the third number to add");
   int n3 = scan.nextInt();
   int Sum = n1 + n2 + n3 ;
   System.out.println("The Sum :" +Sum);
   
   float avg =(float) Sum/3;
   System.out.println("The Avg :" +avg);
   }
  }