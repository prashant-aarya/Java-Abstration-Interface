interface A
{
     default void show()
    {
        System.out.println("A");
    }
} 
interface B
{
     default void show()
    {
        System.out.println("B");
    }
} 
public class SameNameMethod implements A,B
{
   public void show()
    {
        A.super.show();
        B.super.show();
    }
    public static void main(String[] args) {
        SameNameMethod snm=new SameNameMethod();
        snm.show();
    }

    
}
