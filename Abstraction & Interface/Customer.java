interface Vehical
{
    String Name="TVS";
    void start();
    void stop();
    default void color()
    {
        owner();
        System.out.println("TVS colour is Red");
    }
    static void speed()
    {
        System.out.println("TVS Speed is 100km/hr");
    }
    private void owner()
    {
        System.out.println("Owner Name : Prashant Arya ...");
    }
}
public class Customer implements Vehical
{
    public void start()
    {
        System.out.println("Insert key & press start button");
    }
    public void stop()
    {
        System.out.println("Stop(): exit key");
    }
    public static void main(String[] args) 
    {
        Customer c=new Customer();
        System.out.println("Bike Company :  "+c.Name);
        c.start();
        c.color();
        c.stop();

    }

    
}
