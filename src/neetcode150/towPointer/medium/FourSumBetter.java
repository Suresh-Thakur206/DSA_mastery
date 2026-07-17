
// 18. 4 sum
package neetc
ode150.towPointer.medium;

public class FourSumBetter
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        // sorting array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < n - 3; i++) {

            for (int j = i + 1; j < n - 2; j++) {

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = 0L + nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        for (int x = 0; x < list.size(); x++) {
                            for (int y = x; y < list.size(); y++) {
                                if (list.get(x) > list.get(y)) {
                                    int temp = list.get(x);
                                    list.set(x, list.get(y));
                                    list.set(y, temp);
                                }
                            }
                        }
                        if (!set.contains(list)) {
                            set.add(list);
                            result.add(list);

                        }
                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }

            }

        }
        return result;
    }
}{
}
