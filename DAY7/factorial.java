import java .util.*;
public class factorial {
   public static int factorial (int n)
   {
    int fact =1 ,i;
    for(i=1;i<=n;i++){
        fact =fact*i;
    }
    return fact;

   }
    public static void main(String[] args) {
        System.out.println("enter the no ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =factorial(n);
        System.out.println("the factorial is "+fact );
    }
    
}
