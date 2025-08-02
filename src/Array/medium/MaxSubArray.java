//class Solution {
//    public int maxSubArray(int[] nums) {
//        int n=nums.length;
//        int max=nums[0];
//        for(int i=0;i<n;i++){
//            int currSum=0;
//            for(int j=i;j<n;j++){
//                currSum+=nums[j];
//                max=Math.max(max,currSum);
//            }
//        }
//        return max;
//    }
//}