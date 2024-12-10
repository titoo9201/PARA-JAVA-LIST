 import java.util.*;
public class income {
    public static void main(String[] args) {
        System.out.println("enter your income");
        Scanner sc =new Scanner(System.in);
        int income =sc.nextInt();
        int tax;
        if(income<500000)
        {
            System.out.println("tax is zero");
        }
        else if (income>=500000 && income<1000000)
        {
            tax = (int)(income*0.2);
            System.out.println("tax is " + tax);
        }
        else {
            tax= (int)(income*0.3);
            System.out.println("tax is " + tax);
        }
        
    }
}