public class StocksMaxProfit {
    public static void main(String[] args) {
        int prices[]={6,2,4,3,5,1,7};//price of stock daywise
        int profit,buy=0,sell=0,StocksMaxProfit=0;
        for (int i = 0; i < prices.length; i++) { 
            for(int j=i;j<prices.length;j++){
                profit=prices[j]-prices[i];//calculating profit for each day buy and sell on next coming days
                if(profit>StocksMaxProfit){
                    StocksMaxProfit=profit;//if profit is gteater than max profit replacing it
                    buy=i+1;
                    sell=j+1;
                }
            }
        }
        System.out.println("Buy Day "+buy+" Sell Day "+sell);
        System.out.println("Max Profit "+StocksMaxProfit);
    }
}
