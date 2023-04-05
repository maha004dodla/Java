import java.util.*;
public class array_sort 
{  
    public static int sort(int arr[],int m)
    {
        /*//method 1
        int i;
        for(i=1; i<m; i++)
        {
            if(arr[i]<arr[i-1])
            {
                return 0;
            }
        }
        return 1;*/
        //method 2
        int i,count=1,count1=1;
        for(i=0; i<m-1; i++)
        {
            if(arr[i]<arr[i+1])
            {
                count++;
            }
            if(arr[i]>arr[i+1])
            {
                count1++;
            }
        }
        if(count==m || count1==m)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    } 
    public static void main(String arsg[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=sort(arr,n);
        if(res==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        sc.close();
    }
    
}
