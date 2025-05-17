interface I1
{
    void show();                                            //automatic (public+abstract)
}
 class TestInterface implements I1
{
    public void show()                                      //Must Should be public
    {
        System.out.println("Show Method Called");
    }
    public static void main(String[] args) 
    {
        TestInterface t =new TestInterface();
        t.show();
    }
    
}

//We can't create object of interface