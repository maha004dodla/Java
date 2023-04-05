import java.util.*;
public class reverse_array 
{
    public static void reverse(int arr[],int m)
    {
        int i=0,j=m-1,temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        reverse(x,n);
        for(i=0; i<n; i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}
