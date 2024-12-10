 import java.util.*;
public class pattern1{
    public static  void hollow_rectangle(int row,int cln){
        int i,j;
        for( i=1;i<=row;i++)

        {

            for(j=1;j<=cln;j++)

            {

                if(i==1||i==row||j==1||j==cln)
                {
                    System.out.print("*");
                }
                 else{
                    System.out.print(" ");
                 }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
      int a,b;
      System.out.println("enter the value of a and b");
      Scanner sc = new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();

        hollow_rectangle(a,b);

        
    }
}