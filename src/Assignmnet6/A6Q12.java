package Assignmnet6;

import java.util.Scanner;

public class A6Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        reverseTheArray(a, 0);

    }

    private static void reverseTheArray(int[] a, int i) {
        if (i > a.length/2 - 1){
            return;
        }

        int temp = a[i];
        a[i] = a[a.length - 1 - i];
        a[a.length - 1 - i] = temp;

        printArray(a);

        reverseTheArray(a, i + 1);
    }

    private static void printArray(int[] a) {
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
