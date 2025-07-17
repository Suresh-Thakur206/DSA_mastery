package contestQuestion;

import java.util.Scanner;

public class Concatinate {
    // Function to convert number to base with correct characters
    public static String toBase(int number, int base) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (number == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            result.insert(0, chars.charAt(remainder));
            number /= base;
        }

    return result.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int cube = n * n * n;

        String hexPart = toBase(square, 16);     // base-16 for square
        String base36Part = toBase(cube, 36);    // base-36 for cube

        String finalResult = hexPart + base36Part;
        System.out.println("Result: " + finalResult);
    }
}
