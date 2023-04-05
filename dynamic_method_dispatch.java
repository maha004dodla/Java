abstract class parentI
{
    public void m1()
    {
        System.out.println("m1 from parent class");
    }
    public void m2()
    {
        System.out.println("m2 from parent");
    }
    public abstract void m3();
}
class childI extends parentI
{
    public void m2()
    {
        System.out.println("m2 from child");
    }
    public void m3()
    {
        System.out.println("m3 from child");
    }
}
class mainclass_D
{
    public static void main(String args[])
    {
        parentI p=new childI();
        p.m1();
        p.m2();
        p.m3();
    }
}