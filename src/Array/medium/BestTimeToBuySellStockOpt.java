// 122. Best Time to Buy and Sell Stock II

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int left=0;
        int right=1;
        while(right<n){
            if(prices[left]<prices[right]){
                int diff=prices[right]-prices[left];
                profit+=diff;
            }
            left++;
            right++;
        }
        return profit;
    }
}