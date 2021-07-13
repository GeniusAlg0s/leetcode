public class stockTwo {
    public static int maxProfit(int[] prices) {
        int i =0;
        int low = prices[0];
        int high = prices[0];
        int profit = 0;
        while (i < prices.length-1){
            while (i < prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
                low=prices[i];

            while (i < prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
                high=prices[i];

            profit += high-low;
        }

        return profit;
    }
    public static void main(String[]args){
        int [] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }
}