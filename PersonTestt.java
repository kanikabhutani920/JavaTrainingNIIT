import java.util.Scanner;
class Person
 {
  String name;
  int age;
  
  Person(){                                                              //constructor
             System.out.println("In default Constructor");
		 }
    
	void input()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter your name:");
    name=s.next();
    System.out.println("enter your age:");
    age=s.nextInt();
    }
   
   void print()
   {
    System.out.println(" name is"+name);
    System.out.println("age:"+age);
   }
    void eligible()
  {
      if(age<18)
	   {
	     System.out.println("Inelgible to vote !!");
        }
   }
  }

 
   class PersonTestt
   {
     public static void main(String[] args)
     {
       
	   Person objPerson = new Person();
	   Person objPerson1 = new Person();
       objPerson.input();
       objPerson.print();
	   objPerson.eligible();
      }
   }
  