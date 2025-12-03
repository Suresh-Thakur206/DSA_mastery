// 1248. Count Number of Nice Subarrays
// Optimal Solution

class Solution {
    public int numberOfSubarraysAtMostK(int[] nums, int k){
        int start=0;
        int oddNo=0;
        int count=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]%2!=0){
                oddNo++;
            }
            while(start<=end &&oddNo>k){
                if(nums[start]%2!=0){
                    oddNo--;
                    start++;
                }else{
                    start++;
                }
            }
            count+=(end-start+1);
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        return numberOfSubarraysAtMostK(nums,k)- numberOfSubarraysAtMostK(nums,k-1);
    }
}