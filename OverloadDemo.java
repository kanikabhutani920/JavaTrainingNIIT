clas OverloadDemo
{
 void add()
 {
   System.out.println("Overloading Methods");
 }
 void add(double a)
 {
   System.out.println("Overloading Methods" + (a+a));
 }
 void add(int a,int b)
 {
   System.out.println("The addition is:" +(a+b));
 }
 void add(String a,String b)
 {
   System.out.println("The addition is:" +(a+b));
 }

public static void main(String [] args)
 {
 OverloadDemo d1=new OverloadDemo();
 d1.add();
 d1.add(10,20);
 d1.add(10);
 d1.add("Hello","Java");
 }
}


