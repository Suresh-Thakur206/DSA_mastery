// 1248. Count Number of Nice Subarrays
// Brute Force Solution

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if(nums.length==0 || k<0){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int oddNo=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2!=0){
                    oddNo++;

                }
                if(oddNo==k){
                    count++;
                }
                if(oddNo>k){
                    break;
                }

            }
        }
        return count;
    }
}