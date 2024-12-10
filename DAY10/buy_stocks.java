
public class buy_stocks {
    public static int stocks(int prices[])
    {
        int i,buy=Integer.MAX_VALUE, maxprofit=0;
        for(i=0;i<prices.length;i++)
        {
            if(buy<prices[i])
            {
int profit=prices[i]-buy;
            maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buy=prices[i];
            }
        }
    return maxprofit;

    }

    public static void main(String[] args) {
        int prices[]={7,1,5,6,4};
        System.out.println("the maximum profit is " +stocks(prices));

        
    }
}
