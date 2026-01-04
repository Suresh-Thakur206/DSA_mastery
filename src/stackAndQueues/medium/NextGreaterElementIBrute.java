class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            Boolean flag=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(int l=j+1;l<nums2.length;l++){
                        if(nums2[l]>nums2[j]){
                            ans[i]=nums2[l];
                            flag=true;
                            break;
                        }
                    }
                    if(!flag){
                        ans[i]=-1;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}