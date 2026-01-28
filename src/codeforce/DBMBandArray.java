import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();

            int sum = 0;
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            if (sum == s) {
                System.out.println("YES");
            } else if (sum < s && (s - sum) % x == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
