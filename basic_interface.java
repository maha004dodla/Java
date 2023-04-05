interface I1
{
    void m1();  //public static abstract void m1();
    void m2();
    void m3();
}
abstract class dev1 implements I1
{
    public void m1()
    {
        System.out.println("RRR");
    }
    public void m2()
    {
        System.out.println("KGF");
    }
}
class dev2 extends dev1
{
    public void m3()
    {
        System.out.println("SIR");
    }
}
class Mainclass_BI
{
    public static void main(String args[])
    {
        dev2 d1=new dev2();
        d1.m1();
        d1.m2();
        d1.m3();
    }
}
