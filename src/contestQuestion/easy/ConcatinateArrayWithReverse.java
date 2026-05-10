//Concatenate Array With Reverse
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int []ans=new int[n+n];
        int left=0;
        int right=n-1;

        while(left<n){
            ans[left]=nums[left];
            left++;
        }
        while(right>=0){
            ans[n]=nums[right];
            n++;
            right--;
        }
        return ans;
    }
}