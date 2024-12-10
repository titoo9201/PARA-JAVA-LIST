import java.util.*;
public class biggestno {
    public static int getlargest(int n[])
    {
        int largest=Integer.MIN_VALUE;
        int i;
        for(i=0;i<n.length;i++)
        {
            if(largest<n[i])
            {
                largest=n[i];

            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int n[]={1,2,6,3,5};
        System.out.println("largest no is "+getlargest(n));
}

}