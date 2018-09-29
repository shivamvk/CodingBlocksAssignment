package Practice;

import java.util.Scanner;

public class CountPallinromeInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String string = scanner.next();
        System.out.println(countPallindromes("aababb"));
    }

    private static int countPallindromes(String string) {
        int count = 0;
        for (int i = 1; i < string.length(); i++) {
            int left = i;
            int right = i;
            while (left>=0 && right < string.length()){
                if (string.charAt(left) == string.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            left = i;
            right = i + 1;
            while (left>=0 && right < string.length()){
                if (string.charAt(left) == string.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }

        return count;

    }
}
