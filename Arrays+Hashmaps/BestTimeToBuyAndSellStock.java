public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if( prices.length < 2 ) {
            return 0;
        }
        int maxProfit = 0;
        int minStockPrice = Integer.MAX_VALUE;
        for( int i = 0; i < prices.length; i++ ) {
            int price = prices[i];
            minStockPrice = price < minStockPrice? price : minStockPrice;
            int profit = price - minStockPrice;
            maxProfit = profit > maxProfit? profit: maxProfit;
        }
        return maxProfit;
    }
}
