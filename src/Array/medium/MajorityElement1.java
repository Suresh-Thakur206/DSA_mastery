//class Solution {
//    public int majorityElement(int[] nums) {
//        int n=nums.length;
//        int maxcount=0;
//        int majority=nums[0];
//        for(int i=0;i<nums.length;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(nums[j]==nums[i]){
//                    count++;
//                }
//            }
//            if(count>maxcount){
//                maxcount=count;
//                majority=nums[i];
//            }
//        }
//        return majority;
//    }
//}