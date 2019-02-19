import java.util.Scanner;

public class Multiply{

public static void main(String args[]){
   System.out.println("Input the first number ");
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   for(int i = 1;i<=10;i++)
   {
     System.out.println(n + "*" + i + "=" + (n * i) );
	}
  }
}
	