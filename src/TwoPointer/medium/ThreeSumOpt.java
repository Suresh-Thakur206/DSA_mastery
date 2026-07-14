

//15. 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         if (nums[i] > nums[j]) {
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == -nums[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;

                    while ( left < right && nums[left] == nums[left - 1] ) {
                        left++;
                    }
                    while ( left < right && nums[right] == nums[right + 1] ) {
                        right--;
                    }
                } else if (sum < -nums[i]) {
                    left++;
                } else {
                    right--;
                }
            }

        }

        return result;
    }
}