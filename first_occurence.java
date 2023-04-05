import java.util.*;
public class first_occurence 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int A=s1.indexOf(s2);//from first to last
        int B=s1.lastIndexOf(s2);//from last to first
        System.out.println(A);
        System.out.println(B);
        sc.close();
    }
}
