class Time
{
 int hour;
 int minute;
 int second;
  
 public Time(int h,int m,int s)
 {
    this.hour=h;
	this.minute=m;
	this.second=s;
 
 }
 
 void add(Time obj2)
 {
      this.hour+=obj2.hour;
	  this.minute+=obj2.minute;
	  this.second+=obj2.second;
	  
	  if(this.second >= 60 )
	  { 
         this.minute++;
         this.second=this.second-60;
         
	  }
	  if(this.minute>=60)
	  {
		  this.hour++;
		  this.minute=this.minute-60;
		  
	  }
	  
 }
 
 void display()
 {
    
	
   System.out.print(this.hour + " : " + this.minute + " : " + this.second); 
 }
 
 public static void main(String args[])
   {
       Time obj1= new Time(03,54,23);
       Time obj2= new Time(02,45,45);	   
       obj1.add(obj2);
	   obj1.display();
 
 }
 
 }
 