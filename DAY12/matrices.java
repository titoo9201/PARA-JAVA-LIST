import java.util.*;
public class matrices{
    public static boolean search (int mat[][],int key)
    {int a,b,i,j;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[0].length;j++)
            {

                if(mat[i][j]==key)
                {
                   System.out.print("the number is found at index("+i+","+j+")");
                   
                } return true;

               
            }
        } System.out.println("key not found");
             return false;
                
    }
    public static void main(String[] args) {
        int mat[][]=new int[3][3];
        int n,m,i,j, key;
        Scanner sc =new Scanner(System.in);
        
        n=mat.length;
        m=mat[0].length;
       
        //input 
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
//output
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
            search(mat, 5);

    }

}