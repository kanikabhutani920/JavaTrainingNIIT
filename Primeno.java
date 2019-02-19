import java.util.Scanner;

class PrimeNo{
   
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter your number:");
    int n=s.nextInt();
	
	for(int i=2;i<=n/2;i++)
	 {
	   if(n%i==0)
	    {
		  System.out.println("Its not a prime number");
		}
       else
	   {
	     System.out.println("Its a prime");
		}
	 }
  }
}







