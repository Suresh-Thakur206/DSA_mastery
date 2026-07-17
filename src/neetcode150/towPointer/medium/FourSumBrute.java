//18. 4 sum

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long sum = 0L + nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);

                            for(int x=0;x<list.size();x++){
                                for(int y=x;y<list.size();y++){
                                    if(list.get(x)>list.get(y)){
                                        int temp=list.get(x);
                                        list.set(x,list.get(y));
                                        list.set(y,temp);
                                    }
                                }
                            }

                            if (!set.contains(list)) {
                                set.add(list);
                                result.add(list);
                            }
                        }

                    }
                }
            }
        }
        return result;
    }
} so now palce this in brute part