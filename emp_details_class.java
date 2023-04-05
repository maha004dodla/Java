import java.util.*;
class B 
{
    String eid,ename,desg,company_name;
    double salary;
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        System.out.println("enter input values:");
        eid=sc.nextLine();
        ename=sc.nextLine();
        desg=sc.nextLine();
        company_name=sc.nextLine();
        salary=sc.nextDouble();
    }
    public void output()
    {
        System.out.println("output values are:");
        System.out.println("emp id is: "+eid);
        System.out.println("emp name is:"+ename);
        System.out.println("desg is:"+desg);
        System.out.println("company_name is:"+company_name);
        System.out.println("salary is:"+salary);
    }
    public static void main(String args[])
    {
        B obj1=new B();
        B obj2=new B();
        B obj3=new B();
        obj1.input();
        obj2.input();
        obj3.input();
        obj1.output();
        obj2.output();
        obj3.output();
    }
}
