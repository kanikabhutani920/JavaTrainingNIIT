class Employee{
  
  protected String name;
  protected int Empid;
  protected String address;
  protected int Phoneno;
 
   Employee(String name,int Empid,String address,int Phoneno)
   {
        this.name=name;
		this.Empid=Empid;
		this.address=address;
		this.Phoneno=Phoneno;
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
   
   Manager(String name,int Empid,String address,int Phoneno,String Post,int Salary)
   {
       super( name,Empid,address,Phoneno);
	   this.Post=Post;
	   this.Salary=Salary;
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
class A{
   public A(){
   }
   
   public static void main(String args[]){
  // Employee empObj=new Employee("MM",1,"MMM",989);
   Manager manObj=new Manager("kk",2,"KKK",000,"k",222);
   Developer devObj=new Developer("MK",3,"MMK",987,"M","MM","MKK");
   manObj.display();
   devObj.display();
   }

}
