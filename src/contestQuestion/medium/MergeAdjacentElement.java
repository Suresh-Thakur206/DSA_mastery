class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> result = new ArrayList<>();

        for (int num : nums) {
            long curr = num;

            // Keep merging while last element is equal
            while (!result.isEmpty() && result.get(result.size() - 1) == curr) {
                curr += result.remove(result.size() - 1);
            }

            result.add(curr);
        }

        return result;
    }
}
