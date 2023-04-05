import java.util.*;
public class matrix_max_element 
{
    public static int max(int mat[][],int r,int c)
    {
        int i,j,maxi=Integer.MIN_VALUE;
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                if(mat[i][j]>maxi)
                {
                    maxi=mat[i][j];
                }
            }
        }
        return maxi;
    }
    public static void display(int mat[][],int r,int c)
    {
        int i,j;
        System.out.println("input matrix is:");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        r=sc.nextInt();
        c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        display(mat,r,c);
        int res=max(mat,r,c);
        System.out.print("max element is:"+res);
    }
}
