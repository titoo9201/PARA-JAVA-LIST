import java.util.*;
public class golgol {
    public static void spiral (int matrix[][])
    {
      int strow =0,enrow=matrix.length-1,stcol=0,encol=matrix[0].length-1;
        while(strow<=enrow && stcol<=encol) 
        {
            //top boundary
            for( int j=stcol;j<=encol;j++)
            {
             System.out.print(matrix[strow][j]+" ");
            }
            //right boundary 
            for(int i=strow+1;i<=enrow;i++)
            {
                System.out.print(matrix[i][encol]+" ");
            }
            // bottom boundary
            for(int j=encol-1;j>=stcol;j--)
            {
                System.out.print(matrix[enrow][j]+" ");

            }
            // left boundary
            for(int i=enrow-1;i>=strow+1;i--)
            {
                System.out.print(matrix[i][stcol]+" ");
            }
            strow++;
            stcol++;
            enrow--;
            encol--;
        }
    }
    
    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8,}, 
                        {9,10,11,12},
                        { 13,14,15,16}};
                        spiral(matrix);

    }
}
