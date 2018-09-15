package Assignmnet6;

import java.util.Scanner;

public class A6Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(1);
        printPattern(n);
    }

    private static void printPattern(int n) {
        if (n==0){
            return;
        }

        printPattern(n-1);

        for (int i = 0; i <= n; i++) {
            System.out.print(binomialCoeff(n, i)+"   ");
        }
        System.out.println();
    }

    private static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k){
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
