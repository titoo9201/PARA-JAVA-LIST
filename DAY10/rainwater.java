import java.util .*;
public class rainwater {
    public static int trapped_rainwater(int hieght[])

    {
int i;
int tpw =0;
int wl;
        //calculate left max boundary 
        int leftmax[]=new int[hieght.length];
        leftmax[0]=hieght[0];
        for(i=1;i<hieght.length;i++)
        {
            leftmax[i]= Math.max(hieght[i], leftmax[i-1]);
        }
        // calculate right max boundary
        int rightmax[]=new int [hieght.length];
        rightmax[hieght.length-1]= hieght[hieght.length-1];
        for(i=hieght.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(hieght[i],rightmax[i+1]);

        }
        //loop
        for(i=0;i<hieght.length;i++)
        {
          wl=Math.min(leftmax[i],rightmax[i]);
          tpw= tpw+wl-hieght[i];
        }
        return tpw;
    }
public static void main(String[] args)
 {
    int hieght[]={4,2,0,6,3,2,5};
  System.out.println("the total water level is " +trapped_rainwater(hieght));
    
}
    
}
