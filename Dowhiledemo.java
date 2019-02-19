import java.util.Scanner;

public class Dowhiledemo{

public static void main(String args[]){
   System.out.println("Input the first number ");
   Scanner scan = new Scanner(System.in);
   String guess;
   
   do 
     {
	   System.out.println("Guess my name");
	   guess=scan.nextLine();
	 }
	 while(!"Raj".equals(guess));
	 System.out.println("Congratulation u guessed my name correctly");
	 }
  }
