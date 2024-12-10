import java.util.*;
public class reverseno {
    public static void main(String[] args) {
        int n, ld;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            ld = n%10;
            System.out.print(ld);
            n=n/10;
        }
    }
}
