
//15. 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        List<Integer> list1 = new ArrayList<>();

                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);

                        // Sort the triplet
                        for (int x = 0; x < 2; x++) {
                            for (int y = x + 1; y < 3; y++) {
                                if (list1.get(x) > list1.get(y)) {
                                    int temp = list1.get(x);
                                    list1.set(x, list1.get(y));
                                    list1.set(y, temp);
                                }
                            }
                        }

                        if (!set.contains(list1)) {
                            set.add(list1);
                            list.add(list1);
                        }
                    }
                }
            }
        }

        return list;
    }
}