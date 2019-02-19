import java.util.Scanner;

public class Operators{

public static void main(String args[]){
   System.out.println("Input the first number ");
   Scanner scan = new Scanner(System.in);
   int n1 = scan.nextInt();
   System.out.println("Input the second number ");
   int n2 = scan.nextInt();
   
   char op;
   System.out.println("enter the operator:");
   op =sc.next().charAt(0);
   
   switch(op)
   {
       case '+' :
	      System.out.println("The Sum is " +(n1+n2));
		  break;
		  
		case '-' :
	      System.out.println("The Sub is " +(n1-n2));
		  break;
		  
		case '*' :
	      System.out.println("The Mul is " +(n1*n2));
		  break;  
		  
		case '/' :
	      System.out.println("The Div is " +(n1+n2));
		  break;
		
		default :
		   System.out.println("Wrong Operator");
	}
  }
}
	   