package Assignmnet6;

import java.util.Scanner;

public class A6Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        System.out.println(findIndexOfm(a, 0, m));
    }

    private static int findIndexOfm(int[] a, int i, int m) {
        if (i == a.length-1){
            return -1;
        }

        if (a[i] == m){
            return i;
        } else {
            return findIndexOfm(a, i + 1, m);
        }
    }
}
