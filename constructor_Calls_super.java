class A5
{
    public A5()
    {
        System.out.println("A constructor");
    }
}
class B5 extends A5
{
    public B5()
    {
        super(); //super() method is automatically called by the compiler.
        System.out.println("B constructor");
    }
}
class mainclass_cc
{
    public static void main(String args[])
    {
        B5 b=new B5();
    }
}