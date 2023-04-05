import java.util.*;
class array_freq 
{
    public static void freq(int arr[],int n)
    {
        int i,j,c=1;
        for(i=0; i<n-1; i++)
        {
            j=i+1;
            if(arr[i]==arr[j])
            {

                c++;
            }
            else
            {
                System.out.print(arr[i]+" "+c+" ");
                System.out.println();
                c=1;
            }
        }
        System.out.println(arr[i]+" "+c);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++) 
        {
            a[i]=sc.nextInt();
        }
        freq(a,n);
        sc.close();
    }
}
