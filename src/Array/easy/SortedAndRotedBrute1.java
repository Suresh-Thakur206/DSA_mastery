//class Solution {
//    public boolean check(int[] nums) {
//        int n=nums.length;
//        int []arr=new int[n];
//        // iterting rotation
//
//        for(int r=0;r<n;r++){
//            int idx=0;
//            // from rotation to the end
//            for(int i=r;i<n;i++){
//                arr[idx]=nums[i];
//                idx++;
//            }
//
//            // remaining after rotated
//            for(int i=0;i<r;i++){
//                arr[idx]=nums[i];
//                idx++;
//            }
//
//            // checking sorted
//            boolean isTrue=true;
//            for(int i=0;i<arr.length-1;i++){
//                if(arr[i]>arr[i+1]){
//                    isTrue=false;
//                    break;
//                }
//            }
//            if(isTrue){
//                return true;
//            }
//
//
//        }
//        return false;
//    }
//}