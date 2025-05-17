interface I1
{
    void show();                            //public + abstract hota hai bydefault
}
interface I2
{
    void display();
}
public class MultipleInheritance implements I1,I2
{
    public void show()
    {
        System.out.println("1");
    }
    public void display()
    {
        System.out.println("2");
    }
    public static void main(String[] args) 
    {
        MultipleInheritance mi=new MultipleInheritance();
        mi.show();
        mi.display();    
    }
    
}
