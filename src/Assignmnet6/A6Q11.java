package Assignmnet6;

import java.util.Scanner;

public class A6Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(isPallindrome(a, 0));
    }

    private static boolean isPallindrome(int[] a, int i) {
        if (i > a.length/2 + 1){
            return true;
        }

        return a[i] == a[a.length - 1 - i] && isPallindrome(a, i + 1);
    }
}
