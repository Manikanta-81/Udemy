package Udemy;
import java.util.Scanner;

public class Main {
    public static void moveHash(String str, int n) { 
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '#')
                str1 += '#'; 
            else
                str2 += str.charAt(i); 
        }
        String result = str1+str2;
        System.out.println(result);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        int len = a.length();
        
        moveHash(a, len);
    }
}
