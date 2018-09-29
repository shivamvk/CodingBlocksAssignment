package HackerBlocks;

import java.util.Scanner;

public class WhatIsInParan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        whatisinparan(string, 0);

    }

    private static void whatisinparan(String string, int i){
        if (i == string.length()){
            return;
        }

        if (string.charAt(i) == '('){
            for (int j = i+1; string.charAt(j) != ')'; j++) {
                System.out.print(string.charAt(j));
            }
            return;
        }

        whatisinparan(string, i + 1);
    }
}
