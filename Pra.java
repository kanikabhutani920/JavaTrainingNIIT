
 class Parent {

	
	 void m1()
	{
		System.out.println("Parent");
		
	}
	

}

 class Child extends Parent
{
	
	 void m1()
	{
		System.out.println("Child");
	}
}

public class Pra
{
	public static void main(String[] args)

	{
		Parent p = new Parent();
		p.m1();
		Parent p1 =new Child();
		p1.m1();
	}
}
