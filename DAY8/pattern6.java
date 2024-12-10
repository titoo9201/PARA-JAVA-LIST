import java.util.*;
public class pattern6 {
    public static void BUTTERFLY(int r)
    {
        int i,j;
        //1st half 
        for(i=1;i<=r;i++)
        { 
            //starprint
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaceprint
            for(j=1;j<=2*(r-i);j++)
            {
                System.out.print(" ");
            }
            //starprint
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

//2nd half
for(i=r;i>=1;i--)
{ 
    //starprint
    for(j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    //spaceprint
    for(j=1;j<=2*(r-i);j++)
    {
        System.out.print(" ");
    }
    //starprint
    for(j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}

    }
    public static void main(String[] args) {
        System.out.println("enter your value ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        BUTTERFLY(n);
    }
}

