package HackerBlocks;

import java.util.Scanner;

public class KingsmenCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int count = 0;
        //3 2 1 2 3 3
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[j] > a[i]){
                    break;
                }
                if (a[j] == a[i]){
                    count+=2;
                }
            }
        }
        System.out.println(count);
    }
}
