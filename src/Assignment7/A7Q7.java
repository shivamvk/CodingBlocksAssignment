package Assignment7;

import java.util.Scanner;

public class A7Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        skipX(string, "", 0);
    }

    private static void skipX(String unprocessed, String processed, int count) {
        if (unprocessed.isEmpty()){
            for (int i = 0; i < count; i++) {
                processed = processed + "x";
            }
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'x'){
            skipX(unprocessed.substring(1), processed, count + 1);
        } else {
            skipX(unprocessed.substring(1), processed + ch, count);
        }
    }
}
