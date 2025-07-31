//class Solution {
//    public int majorityElement(int[] nums) {
//        int n=nums.length;
//        int count=0;
//        int candiate=0;
//        for(int num:nums){
//            if(count==0){
//                candiate=num;
//            }
//
//            count+=(num==candiate)? 1:-1;
//        }
//        return candiate;
//    }
//}