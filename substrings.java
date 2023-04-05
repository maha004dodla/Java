import java.util.*;
public class substrings 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i,j;
        for(i=0; i<s.length(); i++)
        {
            for(j=i; j<s.length(); j++)
            {
                System.out.println(s.substring(i,j+1));
            }
        }
    }
}
