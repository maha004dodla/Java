import java.util.*;
class second_largest
{
    public static int sec_largest(int x[],int m)
    {
        int i,max=x[0];
        for(i=0; i<m; i++)
        {
            if(max<x[i])
            {
                max=x[i];
            }
        }
        int maxi=x[1];
        for(i=0; i<m; i++)
        {
            if(maxi<x[i] && x[i]<max)
            {
                maxi=x[i];
            }
        }
        return maxi;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=sec_largest(arr,n);
        System.out.println(res);
        sc.close();
    }
}
