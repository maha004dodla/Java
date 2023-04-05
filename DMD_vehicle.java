abstract class vehicle
{
    public abstract int get_no_wheels();
    public abstract int seating_capacity();
}
class bike extends vehicle
{
    public int get_no_wheels()
    {
        return 2;
    }
    public int seating_capacity()
    {
        return 2;
    }
}
class auto extends vehicle
{
    public int get_no_wheels()
    {
        return 3;
    }
    public int seating_capacity()
    {
        return 4;
    }
}
class car extends vehicle
{
    public int get_no_wheels()
    {
        return 4;
    }
    public int seating_capacity()
    {
        return 5;
    }
}
class mainclass_V
{
    public static void main(String arsg[])
    {
        vehicle v;
        int w,c;
        v=new bike();
        System.out.println("=======================");
        System.out.println("Bike:");
        w=v.get_no_wheels();
        c=v.seating_capacity();
        System.out.println("no.of wheels:"+w);
        System.out.println("seating capacity is:"+c);
        System.out.println("=======================");

        v=new auto();
        System.out.println("=======================");
        System.out.println("auto:");
        w=v.get_no_wheels();
        c=v.seating_capacity();
        System.out.println("no.of wheels:"+w);
        System.out.println("seating capacity is:"+c);
        System.out.println("=======================");

        v=new car();
        System.out.println("=======================");
        System.out.println("car:");
        w=v.get_no_wheels();
        c=v.seating_capacity();
        System.out.println("no.of wheels:"+w);
        System.out.println("seating capacity is:"+c);
        System.out.println("=======================");
    }
}
