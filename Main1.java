package Udemy;
import java.util.Scanner;

public class Main1 {
    public static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int count = 1;

            // Count consecutive repeating characters
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append character and count
            result.append(str.charAt(i)).append(count);
        }

        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String compressed = compressString(input);
        System.out.println(compressed);
    }
}
