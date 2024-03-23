class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int rslt = 0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                rslt = Math.max(rslt , (prices[right] - prices[left]));
            }else{
                left = right;
            }
            right++ ;
        }
        return rslt ;
    }
}