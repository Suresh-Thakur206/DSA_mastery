class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    res.add(arr[j]);
                    found = true;
                    break; // stop at first smaller element
                }
            }
            if (!found) {
                res.add(-1); // no smaller element found
            }
        }

        return res;
    }
