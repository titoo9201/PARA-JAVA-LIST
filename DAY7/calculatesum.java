
import java.util.*;
public class calculatesum {
    public static void calculatesum(int num1,int num2){
        int sum = num1+num2;
        System.out.println("the sum is "+ sum);

    }
    public static void main(String[] args) {
          System.out.println("enter the value of a and b");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b= sc.nextInt();
    calculatesum(a, b);

    }
}
