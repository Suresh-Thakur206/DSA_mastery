//class Solution {
//    public int maxSubArray(int[] nums) {
//        int n=nums.length;
//        int max=nums[0];
//        int curr=nums[0];
//        for(int i=1;i<n;i++){
//            curr=Math.max(curr+nums[i],nums[i]);
//            if(curr>max){
//                max=curr;
//            }
//
//        }
//        return max;
//
//    }
//}