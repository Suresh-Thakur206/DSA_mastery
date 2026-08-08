
//189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = 0;
        for (int start = 0; count < n; start++) {
            int curr=start;
            int prev=nums[start];

            do {
                int next = (curr + k) % n;
                int temp = nums[next];
                nums[next] = prev;

                curr = next;
                prev = temp;
                count++;
            } while (curr != start);
        }

    }
}