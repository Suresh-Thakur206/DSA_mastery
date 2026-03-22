class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=left+1;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]==0){
                left++;
            }else if (nums[right]==0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }else{
                right--;
            }
        }

        right=nums.length-1;

        while(left<=right){
            if(nums[left]==1){
                left++;
            }else if (nums[right]==1){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }else{
                right--;
            }
        }


    }
}