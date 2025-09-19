//class Solution {
//    int lowerBound(int[] arr, int target) {
//
//        int mid=arr.length;
//        int left=0;
//        int right=mid-1;
//        int ans=mid;
//        while(left<=right){
//            mid =left+(right-left)/2;
//            if(arr[mid]>=target){
//                ans=mid;
//                right=mid-1;
//            }else{
//                left=mid+1;
//            }
//        }
//        return ans;
//    }
//}
