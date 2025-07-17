package TwoPointer;

import java.util.Scanner;

public class SquareArray2 {
    public static int[] fun(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        int[] arr2 = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[left] > arr[right]) {
                arr2[i] = arr[left];
                left++;
            } else {
                arr2[i] = arr[right];
                right--;
            }
        }

        return arr2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] k = fun(arr);
        System.out.println("Result is:");
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + " ");
        }
    }
}
