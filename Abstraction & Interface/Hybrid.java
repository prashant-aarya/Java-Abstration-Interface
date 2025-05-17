interface A
{
    void show();
}
interface B
{
    void display();
}
class C
{
    void greet()
    {
        System.out.println("Hello from C Class");
    }
}
class D extends C implements A,B
{
    public void show()
    {
        System.out.println("From interface A");
    }
    public void display()
    {
        System.out.println("From interface B");
    }   
}
class Hybrid 
{
    public static void main(String[] args) 
    {
        D d=new D();
        d.greet();
        d.show();
        d.display();
        
    }
}

