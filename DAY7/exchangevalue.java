import java.util.*;

public class exchangevalue {
    public static void swap(int a,int b){
    
        a=a+b;
        b=a-b;
        a=a-b;;
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+ b);
    }
    public static void main(String[] args) {
        System.out.println("enter the value of a and b ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
}
