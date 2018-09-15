package Assignment5;

import java.util.Scanner;

public class A5Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(changeTheString(scanner.next()));
    }

    private static String changeTheString(String string) {
        char ch[] = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0){
                //position of string is odd
                ch[i]++;
            } else {
                //position of string is even
                ch[i]--;
            }
        }
        String st = "";
        for (char c : ch){
            st = st + c;
        }
        return st;
    }
}
