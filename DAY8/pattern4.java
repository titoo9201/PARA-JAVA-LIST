import java.util.*;
public class pattern4 {
    public static void FLYODS_TRIANGLE(int r)
    {
        int i,j ,num=1;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println();
        FLYODS_TRIANGLE(n);
    }
}
