
//3903. Smallest Stable Index I

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            left[i]=max;
        }

        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            right[i]=min;
        }
        for(int i=0;i<n;i++){
            int val=left[i]-right[i];
            if(val<=k){
                return i;
            }
        }
        return -1;

    }
}