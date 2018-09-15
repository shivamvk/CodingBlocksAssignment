package Assignment5;

import java.util.Scanner;

public class A5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getPallindromeCount(scanner.next()));
    }

    private static int getPallindromeCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                System.out.println(string.substring(i, j));
                if (isPallindrome(string.substring(i, j))){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPallindrome(String string) {
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
