package Assignmnet6;

import java.util.Scanner;

public class A6Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int ans[] = new int[n];
        findAllIndicesOfm(a, 0, m, ans, 0);
        for (int i : ans){
            System.out.print(i + " ");
        }
    }

    private static void findAllIndicesOfm(int[] a, int i, int m, int[] ans, int j) {
        if (i > a.length - 1){
            return;
        }

        if (a[i] == m){
            ans[j] = i;
            j++;
        }

        findAllIndicesOfm(a, i + 1, m, ans, j);
    }
}
