import java.util.*;
interface InternalMarks
{
    void getInternalMarks();
    void showInternalMarks();
}
interface ExternalMarks
{
    void getEnternalMarks();
    void showEnternalMarks();
}
interface Marks extends InternalMarks,ExternalMarks
{
    void showTotalMarks();
}
class labmarks implements Marks
{
    int s1_i,s2_i,s3_i,s1_e,s2_e,s3_e,tot_i,tot_e;
    Scanner sc=new Scanner(System.in);
    public void getInternalMarks()
    {
        System.out.println("enter 3 subjects internal marks: ");
        s1_i=sc.nextInt();
        s2_i=sc.nextInt();
        s3_i=sc.nextInt();//
    }
    public void getEnternalMarks()
    {
        System.out.println("enter 3 subjects Enternal marks: ");
        s1_e=sc.nextInt();
        s2_e=sc.nextInt();
        s3_e=sc.nextInt();
    }
    public void showInternalMarks()
    {
        System.out.println("Internal marks are: ");
        System.out.println("sub 1: "+s1_i+" sub 2: "+s2_i+" sub 3: "+s3_i);
    }
    public void showEnternalMarks()
    {
        System.out.println("Enternal marks are: ");
        System.out.println("sub 1: "+s1_e+" sub 2: "+s2_e+" sub 3: "+s3_e);
    }
    public void showTotalMarks()
    {
        System.out.println("Total marks are:");
        System.out.println("subject\tInternalmarks\tExternalmarks\tTotalmarks");
        System.out.println(" sub1  \t   "+s1_i+"   \t   "+s1_e+"   \t   "+(s1_i+s1_e));
        System.out.println(" sub2  \t   "+s2_i+"   \t   "+s2_e+"   \t   "+(s2_i+s2_e));
        System.out.println(" sub3  \t   "+s3_i+"   \t   "+s3_e+"   \t   "+(s3_i+s3_e));
    }
    public static void main(String args[])
    {
        labmarks m=new labmarks();
        m.getInternalMarks();
        m.getEnternalMarks();
        m.showInternalMarks();
        m.showEnternalMarks();
        m.showTotalMarks();
    }
}