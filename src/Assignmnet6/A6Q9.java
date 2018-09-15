package Assignmnet6;

import java.util.Scanner;

public class A6Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        System.out.println(findLastIndexOfm(a, n-1, m));
    }

    private static int findLastIndexOfm(int[] a, int i, int m) {
        if (i < 0){
            return -1;
        }

        if (a[i] == m){
            return i;
        } else {
            return findLastIndexOfm(a, i - 1, m);
        }
    }
}
