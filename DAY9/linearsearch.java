import java.util.*;
public class linearsearch {
    public static int search(int number[],int key){
        int i;
        for(i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        
        int number[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int key;
        System.out.println("enter your no for finding ");
        Scanner sc = new Scanner(System.in);
        key =sc.nextInt();
        int index=search(number, key);
        if(index==-1){
            System.out.println("number not found ");

        }
        else
        {
            System.out.println("number  is found "+index);
        }

    }
    
}
