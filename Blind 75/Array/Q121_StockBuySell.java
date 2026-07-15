class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){ 
                minPrice = price;
                }else{
                    maxProfit = Math.max(maxProfit,(price - minPrice));
                } 
        }
        return maxProfit;
    }
}

class Q121_StockBuySell{
    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        Solution sol = new Solution();
        System.out.println(sol.maxProfit(nums));
    }
}