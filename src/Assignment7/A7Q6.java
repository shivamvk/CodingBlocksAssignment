package Assignment7;

import java.util.Scanner;

public class A7Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(reduceString("", string));
    }

    private static String reduceString(String processed, String unprocessed) {
        if (unprocessed.length() <= 1){
            return processed;
        }

        char ch = unprocessed.charAt(0);
        if (ch == unprocessed.charAt(1)){
            if (unprocessed.substring(2).length() == 1){
                return reduceString(processed + ch + unprocessed.substring(2).charAt(0), unprocessed.substring(2));
            } else {
                return reduceString(processed + ch, unprocessed.substring(2));
            }
        } else {
            if (unprocessed.length() == 2){
                return reduceString(processed + ch + unprocessed.charAt(1), unprocessed.substring(1));
            } else {
                return reduceString(processed + ch, unprocessed.substring(1));
            }
        }
    }
}
