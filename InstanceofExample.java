public class InstanceofExample{
  
  public static void main(String agr[]){
       
	   Vehicle vehicle = new Vehicle();
	   Car car = new Car();
	   MotorCycle moto= new MotorCycle();
	   
	 System.out.println("vehicle instanceof Vehicle: " + (vehicle instanceof  Vehicle));
	 System.out.println("car instanceof Vehical:" +(car instanceof Car));
	 System.out.println("moto instanceof MotorCycle:"+ (moto instanceof MotorCycle));

     System.out.println("vehicle instanceof Car:" + (vehicle instanceof Car));
	 System.out.println("vehicle instanceof Drivecar:"+ (vehicle instanceof Car) );
	 System.out.println("moto instanceof Drivecar:"+ (moto instanceof Drivecar));
	 
	 car=null;
	 System.out.println("(car=null) instanceof Vehicle: " + (car instanceof  Vehicle));
	 System.out.println("(car=null) instanceof Car: " + (car instanceof  Car));
	 
  }
} 

class Vehicle{
}

class Car extends Vehicle implements Drivecar{

}

class MotorCycle extends Vehicle{
}

interface Drivecar{
}