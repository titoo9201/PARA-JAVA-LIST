import java.util.*;
public class pattern3 {
public static void number_priaymid(int r){
    int i,j ;
    //for lines 
    for(i=1;i<=r;i++)
    {
     //for num print
        for(j=1;j<=r-i+1;j++)
        {
            System.out.print(j+" ");
            

}
System.out.println();
    }
}
    public static void main(String[] args) {
     System.out.println("enter the value of n");
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println();
     number_priaymid(n);


    }
}
