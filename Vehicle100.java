interface Car
{
    int  speed=60;
    public void distanceTravelled();
}
interface Bus
{
    int distance=100;
    public void speed();
}
public class Vehicle100  implements Car,Bus
{
    int distanceTravelled;
    int averageSpeed;
    public void distanceTravelled()
    {
        distanceTravelled=speed*distance; 
        System.out.println("Total Distance Travelled is : "+distanceTravelled);
    }
    public void speed()
    {
        int averageSpeed=distanceTravelled/speed;
        System.out.println("Average Speed maintained is : "+averageSpeed);
    }
    public static void main(String args[])
    {
        Vehicle100 v1=new Vehicle100();
        v1.distanceTravelled();
        v1.speed();
    }
}
