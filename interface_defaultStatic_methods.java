interface def
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("default method");
    }
    static void m4()
    {
        System.out.println("static method");
    }
}
class service1 implements def
{
    public void m1()
    {
        System.out.println("m1 method");
    }
    public void m2()
    {
        System.out.println("m2 method");
    }
}
class service2 implements def
{
    public void m1()
    {
        System.out.println("m1 method");
    }
    public void m2()
    {
        System.out.println("m2 method");
    }
    public void m3()
    {
        System.out.println("my own definition");
    }
}
class mainclass_Def
{
    public static void main(String args[])
    {
        def s1=new service1();
        s1.m1();
        s1.m2();
        s1.m3();

        def s2=new service2();
        s2.m1();
        s2.m2();
        s2.m3();
        def.m4();

    }
}

