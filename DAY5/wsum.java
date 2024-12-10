import java.util.*;
public class wsum {
    public static void main(String[] args) {
        
        int i=1;
        int n,sum=0;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
        
            i++;

        }
        System.out.print(sum + " ");
    }
}
