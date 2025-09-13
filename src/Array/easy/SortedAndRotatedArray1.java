//class Solution {
//    public boolean check(int[] nums) {
//        int n = nums.length;
//
//        // Try every possible rotation
//        for (int r = 0; r < n; r++) {
//            boolean isSorted = true;
//
//            // Check if this rotation is sorted
//            for (int i = 0; i < n-1; i++) {
//                int current = nums[(i + r) % n];
//                int next = nums[(i + 1 + r) % n];
//
//                if (current > next) {
//                    isSorted = false;  // Not sorted
//                    break;
//                }
//            }
//
//            // If sorted rotation found, return true
//            if (isSorted) {
//                return true;
//            }
//        }
//
//        // No sorted rotation found
//        return false;
//    }
//}
