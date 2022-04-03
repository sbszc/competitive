public class CodeSignal_stock_prices {
    public static void main(String[] args) {
        int[] prices = {6, 3, 1, 2, 5, 4};
        //int[] prices = {8, 5, 3, 1};
        //int[] prices = {3, 100, 1, 97};

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println(maxProfit);
    }
}