abstract class Vehical
{
    abstract void start();
}
class car extends Vehical
{
    void start()
    {
        System.out.println("Car start with key");
    }
}
public class Scooter extends Vehical
{
    void start()
    {
        System.out.println("Scooter Starts with Kick");
    }
    public static void main(String[] args) 
    {
        //Vehical v = new Vehical();    we can't make object of abstract class

        car c=new car();
        c.start();

        Scooter s=new Scooter();
        s.start();
        
    }
    
}
