import java.util.*;
public class multiplication {
    public static int product (int a,int b ) {
        int pro;
        pro = a*b;
return pro;
    }
    public static void main(String[] args) {
        
        System.out.println("enter the value of a and b ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int pro = product(a, b);
        System.out.println("the product is "+ pro );
    }
}
