import java.util.*;
public class binnarysearch {
    public static int search(int n[],int key)
    {
        int start=0;
        int end=n.length-1;
        while(start<=end)
        {
         int mid =(start+end)/2;
         if(n[mid]==key){
         return key;
        }          
        if  (n[mid]<key)
        {
            start=mid+1;
        }
          else
        {
            end=mid-1;
        }

        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16,18,20,22,24,26};
     int key=8;
System.out.println("index for key is "+search(num, key));
        
    }
}


