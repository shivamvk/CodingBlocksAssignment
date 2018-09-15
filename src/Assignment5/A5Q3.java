package Assignment5;

import java.util.Scanner;

public class A5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(toggle(scanner.next()));
    }

    private static String toggle(String string) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('a' + (ch - 'A'));
            } else {
                ch = (char) ('A' + (ch - 'a'));
            }
            builder.setCharAt(i, ch);
        }

        return builder.toString();
    }
}
