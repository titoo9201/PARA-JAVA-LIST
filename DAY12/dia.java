 import java.util.*;
public class dia {
    public static int diagonal(int mat[][])
    {
        int i,j,sum=0;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[0].length;j++)
            {
            if(i==j)
            {
                sum=sum+mat[i][j];
            }
            else if (i+j==3)
            {
                sum=sum+mat[i][j];
            }
        }
        }
return sum;

    }
    public static void main(String[] args) 
    {
        int mat[][]={{1,2,3,4}, 
                     {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
          System.out.println(diagonal(mat));


    }
}
