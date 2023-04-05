import java.util.*;
public class matrix_min_element 
{
    public static int min(int mat[][],int r,int c)
    {
        int i,j,mini=Integer.MAX_VALUE;
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                if(mat[i][j]<mini)
                {
                    mini=mat[i][j];
                }
            }
        }
        return mini;
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
        int res=min(mat,r,c);
        System.out.print("min element is:"+res);
    }
}
