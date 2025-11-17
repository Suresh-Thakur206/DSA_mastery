//class Solution {
//    public int maximizeExpressionOfThree(int[] nums) {
//        if(nums.length==1){
//            return nums[0];
//        }
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]<nums[i]){
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
//        int a=nums[nums.length-1];
//        int b=nums[nums.length-2];
//        int c=nums[0];
//        int sum=a+b-c;
//        return sum;
//    }
//}