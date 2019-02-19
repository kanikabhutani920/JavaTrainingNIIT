import java.util.Scanner;

class Student
 {
  String name;
  int age;
  int Rollno;
  String branch;
  int arr[] =new int[5];
  int sum=0;
  float per=0;
 
 void input()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter your name:");
    name=s.next();
    System.out.println("enter your age:");
    age=s.nextInt();
	System.out.println("enter your Rollno:");
    Rollno=s.nextInt();
	System.out.println("enter your branch:");
    branch=s.next();
	System.out.print("Enter marks:");
	for(int i=0;i<5;i++)
    {
		
		arr[i]=s.nextInt();
         sum = sum+arr[i];
     }   
    
}
 void Calc()
 {
  // sum = sum+arr[i];
   per=(float) (sum*100)/500; 
   System.out.println("Your percentage is:" +per);
   if(per>80)
   {
	   System.out.println("DISTINCTION 1!!!!");
   }
   else
   {
       System.out.println("DISTINCTION 2!!!!"); 
	}
  }  
 }
  class StudentTest
   {
     public static void main(String[] args)
     {
       Student objStudent = new Student();
       objStudent.input();
      // objPerson.print();
	   objStudent.Calc();
      }
   }