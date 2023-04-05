//default to parameterized
class A4
{
    public A4()
    {
        this("THUB"); //it calls parameterized con from the same class
        System.out.println("welcome to guest");
    }
    public A4(String name)
    {
        System.out.println("welcome to the thub");
    }
}
class mainclass_cct
{
    public static void main(String args[])
    {
        A4 a=new A4();
    }
}

//parameterized to default
/*class A4
{
    public A4()
    {
        System.out.println("welcome to guest");
    }
    public A4(String name)
    {
        this();
        System.out.println("welcome to the thub");
    }
}
class mainclass3
{
    public static void main(String args[])
    {
        A4 a=new A4("THUB");
    }
}*/