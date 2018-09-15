package Assignmnet6;

import java.util.Scanner;

public class A6Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        System.out.println(findNumber(a,0,m));
    }

    private static boolean findNumber(int[] a, int i, int m) {
        if (i == a.length-1){
            return false;
        }

        return a[i] == m || findNumber(a, i + 1, m);
    }
}
