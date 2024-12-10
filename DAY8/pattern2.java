import java .util.*;
public class pattern2 {
public static void inverted_pyramid(int r){
    int i,j;
    for(i=1;i<=r;i++){
        for(j=1;j<=r-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        System.out.println("enter value of r ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        inverted_pyramid(n);
    }
}
