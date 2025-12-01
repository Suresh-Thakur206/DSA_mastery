// 1004. Max Consecutive Ones III
// Optimal Solution

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0;
        int n=nums.length;
        int start=0;
        int zeroCount=0;
        for(int end=0;end<n;end++){
            if(nums[end]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            maxLen=Math.max(maxLen,end-start+1);

        }
        return maxLen;
    }
}