import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a,b,result;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Input two integers");
		a=scan.nextInt();
		b=scan.nextInt();
		
		try {
			result=a/b;
			System.out.println("Result =" +result);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught: Division by zero:");
		}
		finally {
		    scan.close();
		    System.out.println("In finally block");
		}
	}
}


