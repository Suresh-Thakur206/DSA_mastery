//public static int[] findMaxSubarray(int[] arr) {
//    int maxSoFar = arr[0];
//    int maxEndingHere = arr[0];
//    int start = 0, end = 0, tempStart = 0;
//
//    for (int i = 1; i < arr.length; i++) {
//        if (arr[i] > maxEndingHere + arr[i]) {
//            maxEndingHere = arr[i];
//            tempStart = i;
//        } else {
//            maxEndingHere += arr[i];
//        }
//
//        if (maxEndingHere > maxSoFar) {
//            maxSoFar = maxEndingHere;
//            start = tempStart;
//            end = i;
//        }
//    }
//
//    // Create and return the subarray from start to end
//    int[] result = new int[end - start + 1];
//    for (int i = 0; i < result.length; i++) {
//        result[i] = arr[start + i];
//    }
//
//    return result;
//}
