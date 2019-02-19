import java.util.Scanner;

public class ArrayEx1{

public static void main(String args[]){
    int[] numbers = {8,18,5,2,1,10};
	int i;
	System.out.println("Total number of elements in an array is:" + numbers.length);
	System.out.println("First elements in an array is:" + numbers[0]);
	System.out.println("Last elements in an array is:" + numbers[numbers.length-1]);
	
	//sum array elements
	int sum=0;
	for(i=0;i<numbers.length;i++)
	   {
	     sum+=numbers[i];
	   }
	 
	 System.out.println("The sum of Array element:"+sum);
	 
	}
}