import java.util.Scanner;

public class GenericPairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pair secretPair=new Pair("Happy" , "Day");
		
		Scanner Keyboard=new Scanner(System.in);
		System.out.println("Enter two word:");
		String word1=Keyboard.next();
		String word2=Keyboard.next();
		
		Pair inputPair=new Pair(word1,word2);
		Pair<Integer> secretPair1=new Pair<Integer>(10,20);
		secretPair.display();
		
		
		if(inputPair.equals(secretPair1))
		{
			System.out.println("You guessed the secret words:");
			System.out.println("in the correct Order!!");
		}
		else
		{
			System.out.println("You guessed incorrectly");
			System.out.println("You Guessed");
			System.out.println(inputPair);
			System.out.println("The secret words are");
			System.out.println(secretPair1);
		}

		
	}

}
