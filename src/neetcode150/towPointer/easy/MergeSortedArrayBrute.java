
//26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length==0) return 0;
        int n = nums.length;
        int left = 0;
        int mid = left + 1;
        list.add(nums[0]);
        while (mid < n) {
            if (nums[mid] == nums[left]) {
                mid++;
            }
            else{
                list.add(nums[mid]);
                left = mid;
                mid++;
            }

        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}