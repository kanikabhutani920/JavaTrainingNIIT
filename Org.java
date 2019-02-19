class Employee{
  
  protected String name;
  protected int Empid;
  protected String address;
  protected int Phoneno;
 
   Employee(String n,int id,String add,int no)
   {
        name=n;
		Empid=id;
		address=add;
		Phoneno=no;
   }
   
   void display()
   {
      System.out.println("The name is: " + name);
	  System.out.println("The Empid is: " + Empid);
	  System.out.println("The address is:" + address);
	  System.out.println("The Phoneno is: " + Phoneno);
   }
}

class Manager extends Employee{
   protected String Post;
   protected int Salary;
   
   Manager(String name,int id,String add,int no,String P,int Sal)
   {
       super( name,id,add,no);
	   Post=P;
	   Salary=Sal;
   }
   
   void display()
   {
        super.display();
		System.out.println("The Post is: " +Post);
	    System.out.println("The Salary is: " + Salary);
	 
   }
 }

class Developer extends Employee
{
      protected String Skill;
	  protected String experience;
	  protected String designation;
     
	 Developer(String name,int Empid,String address,int Phoneno,String Skill,String experience,String designation)
	 {
	     super(name,Empid,address,Phoneno);
		 Skill=Skill;
		 experience=experience;
		 designation=designation;
	 }
	 void display()
	 {
	      super.display();
		  System.out.println("The Skill is: " + Skill);
	      System.out.println("The experience is: " + experience);
	      System.out.println("The designation is: " + designation);
	 
	 }
}
class Org{
   public Org(){
   }
   
   public static void main(String args[]){
  // Employee empObj=new Employee("MM",1,"MMM",989);
   Manager manObj=new Manager("kk",2,"KKK",000,"k",222);
   Developer devObj=new Developer("MK",3,"MMK",987,"M","MM","MKK");
   manObj.display();
   devObj.display();
   }

}
