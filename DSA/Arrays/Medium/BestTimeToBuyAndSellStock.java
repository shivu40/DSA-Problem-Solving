package DSA.Arrays.Medium;

public class BestTimeToBuyAndSellStock {

        // Intuition: For each day we are finding the price which is least of all the previous days, That's how we will
        // get max profit. Now we will find maximum of all the profits and that is our answer.
        public int maxProfit(int[] prices) {
            int leastSoFar = Integer.MAX_VALUE;
            int todayProfit = 0;
            int totalProfit = 0;

            for(int i = 0; i < prices.length; i++){
                leastSoFar = Math.min(prices[i], leastSoFar);
                todayProfit = prices[i] - leastSoFar;
                totalProfit = Math.max(totalProfit, todayProfit);
            }

            return totalProfit;
        }
}
