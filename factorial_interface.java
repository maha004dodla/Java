interface I2
{
    int fact(int n);
}
class devf1 implements I2
{
    public int fact(int n)
    {
        int i,f=1;
        for(i=1; i<=n; i++)
        {
            f=f*i;
        }
        return f;
    }
}
class devf2 implements I2
{
    public int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}
class mainclass_f
{
    public static void main(String args[])
    {
        devf1 d1=new devf1();
        System.out.println("implemented by iteration "+d1.fact(5));
        devf2 d2=new devf2();
        System.out.println("implemented by recursion "+d2.fact(5));

    }
}
