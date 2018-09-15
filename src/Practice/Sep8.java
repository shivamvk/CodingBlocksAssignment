package Practice;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Sep8 {
    public static void main(String[] args) {
        int nums[][] = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        //printSpiralPrint(nums);

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        //System.out.println(string.indexOf('l'));
        subStrings(string);
        //isPallindrome(string);
        //System.out.println(toggle(string));
    }

    @NotNull
    private static String toggle(String hello) {
        StringBuilder builder = new StringBuilder(hello);
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

    @NotNull
    private static void isPallindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length()-1-i)){
                System.out.println("Not Pallindrome");
                return;
            }
        }
        System.out.println("Pallindrome");
    }

    private static void locations(String string, String pattern) {
        int si = 0;
        while (true){
            int loc = string.indexOf(pattern, si);
            if (loc == -1){
                break;
            }

            System.out.println(loc);
            si = loc + 1;
        }
    }

    private static void subStrings(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                System.out.println(string.substring(i,j));
            }
        }
    }

    private static void printSpiralPrint(int[][] nums) {
        int left = 0;
        int top = 0;
        int bottom = nums.length;
        int right = nums[0].length;

        while (left<=right && top<=bottom){
            for (int i = left; i < right; i++) {
                System.out.println(nums[top][i]);
            }

            for (int i = top+1; i < bottom-1; i++) {
                System.out.println(nums[i][right-1]);
            }

            for (int i = right - 1; i >= left; i--) {
                System.out.println(nums[bottom-1][i]);
            }

            for (int i = bottom - 2; i > top ; i--) {
                System.out.println(nums[i][left]);
            }

            left++;
            top++;
            bottom--;
            right--;
        }
    }
}
