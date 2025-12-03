// 930. Binary Subarrays With Sum
// Optimal Solution for Binary SubArrays With Sum

class Solution {
    public int numSubarraysWithSumAtMostK(int[] nums, int goal){
        int start=0;
        int sum=0;
        int count=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            while(start<=end &&sum>goal){
                sum-=nums[start];
                start++;
            }
            count+=(end-start+1);
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal<0){
            return 0;
        }
        return numSubarraysWithSumAtMostK( nums, goal)- numSubarraysWithSumAtMostK( nums,  goal-1);
    }
}