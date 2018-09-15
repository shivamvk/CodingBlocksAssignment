package Assignmnet6;

import java.util.Scanner;

public class A6Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(isSorted(a, 0));
    }

    private static boolean isSorted(int[] a, int i) {
        if (i==a.length-1){
            return true;
        }

        return a[i] < a[i+1] && isSorted(a, i + 1);
    }
}
