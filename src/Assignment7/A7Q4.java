package Assignment7;

import java.util.Scanner;

public class A7Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        System.out.println(isPallindrome(string, 0));
    }

    private static boolean isPallindrome(String string, int i) {
        if (i >= string.length()/2 + 1){
            return true;
        }

        return string.charAt(i) == string.charAt(string.length() - i - 1) && isPallindrome(string, i + 1);
    }
}
