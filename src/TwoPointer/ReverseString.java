package TwoPointer;
import java.util.Scanner;

public class ReverseString {
    public static char[] reverse(char[] ch){
        int n = ch.length;
        int left = 0;
        int right = n - 1;

        // Same logic for both even and odd lengths
        for (int i = 0; i < n / 2; i++) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        char[] ch = name.toCharArray();
        char[] ch2 = reverse(ch);  // reversed version

        // Print in format ["d", "o", "o", "G"] for input "Good"
        System.out.print("[");
        for (int i = 0; i < ch2.length; i++) {
            System.out.print("\"" + ch2[i] + "\"");
            if (i != ch2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}