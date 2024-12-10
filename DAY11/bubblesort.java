import java.util.*;
public class bubblesort {
    public static void  sorting (int n[])
    { int i,j;
for(i=0;i<n.length-1;i++)
    {
for(j=0;j<n.length-1-i;j++)
{
 
    if(n[j]>n[j+1])
    {
int temp=n[j];
n[j]=n[j+1];
n[j+1]=temp;

    }
}
    }
    }
    public static void printarray (int n[]){
        int i;
        for(i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int n[]={ 5,4,3,1,2};
        sorting(n );
        printarray(n);

    }
}
