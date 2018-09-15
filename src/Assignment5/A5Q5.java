package Assignment5;

import java.util.Scanner;

public class A5Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(buildString(scanner.next()));
    }

    private static String buildString(String string) {
        StringBuilder builder = new StringBuilder();
        builder.append(string.charAt(0));
        for (int i = 0; i < string.length() - 1; i++) {
            int j = Math.abs(string.charAt(i) - string.charAt(i + 1));
            builder.append(j);
            builder.append(string.charAt(i + 1));
        }
        return builder.toString();
    }
}
