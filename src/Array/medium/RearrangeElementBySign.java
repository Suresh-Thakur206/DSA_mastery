//package Array.medium;
//
//public class RearrangeElementBySign class Solution {
//    public int[] rearrangeArray(int[] nums) {
//        int n=nums.length;
//        int []pos=new int[n/2];
//        int[]neg=new int[n/2];
//        int p=0;
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(nums[i]>0){
//                pos[k]=nums[i];
//                k++;
//            }else{
//                neg[p]=nums[i];
//                p++;
//            }
//        }
//
//        int x=0;
//        int y=0;
//
//        for(int i=0;i<n;i++){
//            if(i%2==0){
//                nums[i]=pos[x];
//                x++;
//            }else{
//                nums[i]=neg[y];
//                y++;
//            }
//        }
//
//        return nums;
//    }
//}{
//}
