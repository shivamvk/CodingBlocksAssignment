package Assignment5;

import java.util.Scanner;

public class A5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPallindrome(scanner.next()));
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
