package array;

public class BestTimeToSellAndBuyStock {

    public static void main(String[] args) {
        int[] prices = {2,3,5,9,7};
        int p = buyAndSellStockBruteForce(prices);
        System.out.println(p);
    }

    private static int buyAndSellStockBruteForce(int[] prices){
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++){
            for (int j = i+1; j < prices.length; j++){
                if (prices[j] - prices[i] > maxProfit){
                    maxProfit = prices[j]- prices[i];
                }
            }
        }
        return maxProfit;
    }

    public static void bestTimeToSellAndBuyStock(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for (int i = 0; i<prices.length; i++){
            if (lsf > prices[i])
                lsf = prices[i];

            pist = prices[i] - lsf;
            if (op < pist)
                op = pist;
        }
        System.out.println(op);
    }

    private static int buyAndSell(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++){
            if (buy > prices[i]){
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i]- buy;
            }
        }
        return maxProfit;
    }
}
