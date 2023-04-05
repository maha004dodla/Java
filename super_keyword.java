//with super keyword with same variables names
class A2
{
    String name="sadwika";
    public void show()
    {
        System.out.println("age is: "+name);
    }
}
class B2 extends A2
{
    String name="maha";
    public void display()
    {
        System.out.println("name in B2 is: "+name);
        System.out.println("name in A2 is: "+super.name);
    }
}
class mainclass1
{
    public static void main(String args[])
    {
        B2 b=new B2();
        b.display();
    }
}

//without super keyword
/*class A2
{
    String name="sadwika";
    public void show()
    {
        System.out.println("age is: "+name);
    }
}
class B2 extends A2
{
    String name="maha";
    public void display()
    {
        System.out.println("name in B2 is: "+name);
        System.out.println("name in A2 is: "+name);
    }
}
class mainclass1
{
    public static void main(String args[])
    {
        B2 b=new B2();
        b.display();
    }
}*/
