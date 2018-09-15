package Assignmnet6;

import java.util.Scanner;

public class A6Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
    }

    private static void printPattern(int n) {
        if (n==0){
            return;
        }

        printPattern(n-1);

        for (int i = 0; i < n; i++) {
            System.out.print("*\t");
        }

        System.out.println();
    }
}
