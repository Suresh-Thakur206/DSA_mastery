class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int []result=new int[n];
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    result[i]=nums[j];
                    found=true;
                    break;
                }
            }
            if(!found){
                for(int k=0;k<i;k++){
                    if(nums[k]>nums[i]){
                        result[i]=nums[k];
                        found=true;
                        break;
                    }
                }
            }
            if(!found){
                result[i]=-1;
            }

        }
        return result;
    }
}