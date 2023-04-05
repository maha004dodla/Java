import java.util.*;
public class longest_palindrome
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
        String s1=sc.nextLine();
        String words[]=s1.split(" ");
        int i,k=0;
        String s="";
        for(i=0; i<words.length; i++)
        {
            if(pal(words[i]))
            {
                if(words[i].length()>k)
                {
                    k=words[i].length();
                    s=words[i];
                }
            }
        }
        System.out.println(s);
        System.out.println(k);
        sc.close();
    }
}
