//public class BruteForceRotatedSorted {
//
//    public static void main(String[] args) {
//        int[] nums = {3, 4, 5, 1, 2}; // Example input
//        int n = nums.length;
//        boolean isRotatedSorted = false;
//
//        // Try all possible rotations
//        for (int rotate = 0; rotate < n; rotate++) {
//            boolean sorted = true;
//
//            // Check if this rotated view would be sorted
//            for (int i = 0; i < n; i++) {
//                int current = nums[(i + rotate) % n];
//                int next = nums[(i + 1 + rotate) % n]; // circular check
//                if (current > next) {
//                    sorted = false; // Not sorted
//                    break; // Stop checking this rotation
//                }
//            }
//
//            if (sorted) {
//                isRotatedSorted = true;
//                break; // Found a sorted rotation, no need to check further
//            }
//        }
//
//        System.out.println(isRotatedSorted); // true or false
//    }
//}
//public class BruteForceRotatedSorted {
//
//    public static void main(String[] args) {
//        int[] nums = {3, 4, 5, 1, 2}; // Example input
//        int n = nums.length;
//        boolean isRotatedSorted = false;
//
//        // Try all possible rotations
//        for (int rotate = 0; rotate < n; rotate++) {
//            boolean sorted = true;
//
//            // Check if this rotated view would be sorted
//            for (int i = 0; i < n; i++) {
//                int current = nums[(i + rotate) % n];
//                int next = nums[(i + 1 + rotate) % n]; // circular check
//                if (current > next) {
//                    sorted = false; // Not sorted
//                    break; // Stop checking this rotation
//                }
//            }
//
//            if (sorted) {
//                isRotatedSorted = true;
//                break; // Found a sorted rotation, no need to check further
//            }
//        }
//
//        System.out.println(isRotatedSorted); // true or false
//    }
//}
