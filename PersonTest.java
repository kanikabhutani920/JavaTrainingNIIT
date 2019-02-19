import java.util.Scanner;
class Person{
String name;
int age;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter your name:");
name=s.next();
System.out.println("enter your age:");
name=s.nextInt();
}
void print()
{
System.out.println(" name is"+name);
System.out.println("age:"+age);
}
}



class PersonTest
{
public static void main(String[] args)
{
Person objPerson = new Person();
objPerson.input();
objPerson.print();
}
}