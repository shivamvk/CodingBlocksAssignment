package Assignment7;

import java.util.Scanner;

public class A7Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        //System.out.println(countHi(string, 0));
        System.out.println(removeHi(string, ""));
    }

    private static String removeHi(String unprocessed, String processed) {
        if (unprocessed.length() <= 1){
            if (unprocessed.isEmpty()){
                return processed;
            } else {
                return processed + unprocessed.charAt(0);
            }
        }

        String str = unprocessed.substring(0, 2);
        if (str.equals("hi")){
            return removeHi(unprocessed.substring(2), processed);
        } else {
            return removeHi(unprocessed.substring(1), processed + unprocessed.charAt(0));
        }
    }

    private static int countHi(String string, int i) {
        if (string.length() <= 1){
            return i;
        }

        String str = string.substring(0, 2);
        if (str.equals("hi")){
            i = i + 1;
        }
        return countHi(string.substring(1), i);
    }
}
