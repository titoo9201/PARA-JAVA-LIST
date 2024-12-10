import java.util.*;
public class wnaturalno {
    public static void main(String[] args) {
        int i=1;
        int n;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("print the no from 1 to n");
    }
}
