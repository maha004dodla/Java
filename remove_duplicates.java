import java.util.*;
public class remove_duplicates 
{
    public static void remove_dup(int arr[],int n)
    {
        int i,j;
        for(i=0; i<n; i++)
        {
            for(j=i+1; j<n; j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=arr[j];
                    arr[j]=-1;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        remove_dup(arr,n);
        remove_dup(arr,n);
        for(i=0; i<n; i++)
        {
            if(arr[i]!=-1)
            {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
