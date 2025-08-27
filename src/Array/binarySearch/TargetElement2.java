//class Solution {
//    public int search(int[] nums, int target) {
//        int n=nums.length;
//        boolean status=false;
//
//        if(n==1){
//            if(nums[0]==target){
//                return  0;
//            }
//        }
//        if(target==nums[n/2]){
//            return (n/2);
//        }
//        else if(target>nums[n/2]){
//            status=true;
//        }else{
//            status=false;
//        }
//
//        if(status){
//            for(int i=(n/2)+1;i<n;i++){
//                if(nums[i]==target){
//                    return i;
//                }
//            }
//        }
//        if(status==false){
//            for(int i=0;i<n/2;i++){
//                if(nums[i]==target){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//}