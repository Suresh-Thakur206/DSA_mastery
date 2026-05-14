package recursion.easy;

public class MaxElementInArray {
    public static int findMax(int[] arr, int i) {
        // base case
        if (i == arr.length - 1) return arr[i];

        // single recursive call, no pre-increment
        return Math.max(arr[i], findMax(arr, i + 1));
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 2, 8, 1, 9, 0, 7};
        int maximum = findMax(arr, 0); // start from index 0
        System.out.println("max element : " + maximum);
    }
}
