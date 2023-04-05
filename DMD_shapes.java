import java.util.*;
abstract class shape
{
    int s1,s2;
    float area;
    final float pi=3.14f;
    Scanner sc=new Scanner(System.in);
    public abstract void get_input();
    public abstract void calarea();
    public void show_area()
    {
        System.out.println("area is:"+area);
    }
}
class rectangle extends shape
{
    public void get_input()
    {
        System.out.println("enter length and breadth :");
        s1=sc.nextInt();
        s2=sc.nextInt();
    }
    public void calarea()
    {
        area=s1*s2;
    }
    
}
class square extends shape
{
    public void get_input()
    {
        System.out.println("enter side value :");
        s1=sc.nextInt();
    }
    public void calarea()
    {
        area=s1*s1;
    }
}
class circle extends shape
{
    public void get_input()
    {
        System.out.println("enter radius :");
        s1=sc.nextInt();
    }
    public void calarea()
    {
        area=pi*s1*s1;
    }
}
class mainclass_S
{
    public static void main(String args[])
    {
        shape s;
        s=new rectangle();
        System.out.println("=================");
        System.out.println("rectangle");
        s.get_input();
        s.calarea();
        s.show_area();
        System.out.println("=================");

        s=new square();
        System.out.println("=================");
        System.out.println("square");
        s.get_input();
        s.calarea();
        s.show_area();
        System.out.println("=================");

        s=new circle();
        System.out.println("=================");
        System.out.println("circle");
        s.get_input();
        s.calarea();
        s.show_area();
        System.out.println("=================");
    }
}
