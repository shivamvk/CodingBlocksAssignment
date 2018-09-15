package Assignmnet6;

import java.util.Scanner;

public class A6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers(n);
    }

    private static void printNumbers(int n) {
        if (n == 0){
            return;
        }

        if (n%2!=0){
            System.out.print(n + ", ");
        }
        printNumbers(n-1);
        if (n%2==0){
            System.out.print(n + ", ");
        }
    }
}
