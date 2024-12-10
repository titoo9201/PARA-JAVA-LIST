import java.util.*;
public class primeno{
public static void main(String[] args) {
    int n,i;
    System.out.println("enter the value of n:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    boolean isprime =true;
    for(i=2;i<n-1;i++)
    {
        if(n%i==0){
            isprime=false;
        }
     
        
    } 
    if(isprime==true)
    {
        System.out.println(" number n is prime no ");

    }
    else{
        System.out.println(" nuber n is not prime no " );
    }


}
}
