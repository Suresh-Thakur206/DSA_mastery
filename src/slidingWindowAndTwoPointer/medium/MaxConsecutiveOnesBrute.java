// 1004. Max Consecutive Ones III
// Brute Force Solution

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0;
        int n=nums.length;
        for(int start=0;start<n;start++){
            int zeroCount=0;
            for(int end=start;end<n;end++){
                if(nums[end]==0){
                    zeroCount++;
                }
                if(zeroCount>k){
                    break;
                }
                maxLen=Math.max(maxLen,end-start+1);
            }
        }
        return maxLen;
    }
}