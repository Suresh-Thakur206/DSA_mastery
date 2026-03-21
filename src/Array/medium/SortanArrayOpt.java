class Solution {

    public void merge(int nums[],int low,int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[right]<nums[left]){
                list.add(nums[right]);
                right++;
            }else{
                list.add(nums[left]);
                left++;
            }

        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(right<=high){
            list.add(nums[right]);
            right++;
        }
        for(int i=low ; i<=high;i++){
            nums[i]=list.get(i-low);
        }
    }

    public void mergeSort(int []nums,int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        // int arr=new int[nums.length];
        int low=0;
        int high=nums.length-1;
        mergeSort(nums,low, high);
        return nums;
    }
}