
// Q1. Minimum Swaps to Move Zeros to End©leetcode
class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int cnt=0;
        if(n==0 || n==1) return 0;

        while(left<right){
            while(left<right && (nums[left]==0 && nums[right]==0)){

                right-=1;
            }
            if(left>=right) return cnt;
            if(nums[left]==0 ){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                cnt++;
                left=left+1;
                right=right-1;

            }else{
                left++;
            }
        }
        return cnt;

    }
}