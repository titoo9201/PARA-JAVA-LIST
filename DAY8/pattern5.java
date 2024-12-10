import java.util.*;
public class pattern5 {
    public static void zero_one_TRIANGLE(int r)
    {
        int i,j;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
               System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println();
        zero_one_TRIANGLE(n);
    }
}
