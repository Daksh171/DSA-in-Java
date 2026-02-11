public class stock {
        public  static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
          int profit=0;; 
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int curr=prices[i]-buy;
                profit=Math.max(curr, profit);
            }
            else{
                buy=prices[i];
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        // prices = [7,1,5,3,6,4]
        int prices[]={4,3,2};
        System.out.println(maxProfit(prices));
    }
}
