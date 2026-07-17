//
//
////15. 3Sum
//
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        Set<List<Integer>> set = new HashSet<>();
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < n - 2; i++) {
//            int fixed = i;
//            int left = i + 1;
//            int right = n - 1;
//            while (left < right) {
//
//                int sum = nums[left] + nums[right];
//                List<Integer> list = new ArrayList<>();
//                list.add(nums[fixed]);
//                list.add(nums[left]);
//                list.add(nums[right]);
//                if (sum == -nums[fixed]) {
//                    if (!set.contains(list)) {
//                        set.add(list);
//                        result.add(list);
//
//                    }
//                    left++;
//                    right--;
//
//                } else if (sum < -nums[fixed]) {
//                    left++;
//                } else {
//                    right--;
//                }
//
//            }
//        }
//        return result;
//    }
//}