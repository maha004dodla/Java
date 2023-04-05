import java.util.*;
public class array_rotation 
{ 
    public static void left_rotate(int arr[],int d,int n)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[],int l,int h)
    {
        int temp;
        while(l<h)
        {
            temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,d;
        n=sc.nextInt();
        d=sc.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        left_rotate(a,d,n);
        for(i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
