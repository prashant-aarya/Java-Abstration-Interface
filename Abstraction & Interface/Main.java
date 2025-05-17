abstract class Animals
{
    void legs()
    {
        System.out.println("All animal have 4 legs");
    }
    abstract void sound();
    abstract void eat();
}
class Dog extends Animals
{
    void sound()
    {
        System.out.println("Bow Bow ..");
    }
    void eat()
    {
        System.out.println("Meat eating");
    }
}
class Cow extends Animals
{
    void sound()
    {
        System.out.println("Mhh Mhh ...");
    }
    void eat()
    {
        System.out.println("Grass Eating ..");
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Dog d=new Dog();
        Cow c=new Cow();
        d.sound();
        d.eat();
        d.legs();
        c.eat();
        c.eat();
        c.legs();
        
    }
    
}
