import java.util.*;
public class string_palindrome
{
    public static boolean pal(String s)
    {
        int n,i;
        n=s.length();
        char ch[]=s.toCharArray();
        for(i=0; i<n/2; i++)
        {
            if(ch[i]!=ch[n-i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(pal(s))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        sc.close();
    }
}
