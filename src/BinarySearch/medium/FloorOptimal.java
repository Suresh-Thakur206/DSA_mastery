//class Solution {
//    public int findFloor(int[] arr, int x) {
//        // code here
//        int left=0;
//        int right=arr.length-1;
//        int floor=-1;
//        while(left<=right){
//            int mid=left+(right-left)/2;
//            if(arr[mid]==x){
//                floor=mid;
//                left=mid+1;
//            }
//            else if(arr[mid]>x){
//                right=mid-1;
//            }
//            else{
//                floor=mid;
//                left=mid+1;
//            }
//        }
//        return floor;
//    }
//}