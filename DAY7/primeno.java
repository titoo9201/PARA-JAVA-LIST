import java.util.*;
public class primeno {
// ye vala function prime no check ke liye hai 
    public static boolean isprime(int n ){
        boolean isprime= true;
        for(int i =2;i<n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }   
    return isprime;
    }
    //prime ki range nikal ne ke liye hai ye vala function 
    public static void primerange(int n){
        for(int i =2; i<=n;i++){
        if(isprime(i)){
            System.out.print(i + " ");
        }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
boolean prime = isprime(n);
    
        System.out.println(prime);
    primerange(n);

    }

}