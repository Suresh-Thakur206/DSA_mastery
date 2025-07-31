//class Solution {
//    public int majorityElement(int[] nums) {
//        int n=nums.length;
//
//        int majority=0;
//        int max=nums[0];
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(nums[i]==max){
//                count++;
//            }else{
//                count--;
//            }
//            if(count==0){
//                max=nums[i];
//                count=1;
//            }
//            else{
//                majority=max;
//
//            }
//            if(i==n-1){
//                majority=max;
//                return majority;
//            }
//
//
//        }
//        return majority;
//    }
//
//}
