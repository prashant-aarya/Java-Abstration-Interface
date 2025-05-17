abstract class Vehical
{
    abstract void start();
    abstract void stop();

}
class abstr extends Vehical
{
    void start()
    {
        System.out.println("Start");
    }
    void stop()
    {
        System.out.println("Stop");
    }
    public static void main(String[] args) 
    {
        abstr ab=new abstr();
        ab.start();;
        ab.stop();;

        
    }
}