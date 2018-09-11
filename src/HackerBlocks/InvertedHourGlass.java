package HackerBlocks;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = 0;
        if (n%2==0){
            gap = 2 * n - 1;
        } else {
            gap = 2 * n - 1;
        }
        for (int i = n; i >=0 ; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j+" ");
            }
            for (int j = 0; j < gap; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                if (j!=0){
                    System.out.print(j+" ");
                }
            }
            gap-=2;
            System.out.println();
        }
        gap = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j+" ");
            }
            for (int j = 0; j < gap; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(j+" ");
            }
            gap+=2;
            System.out.println();
        }
    }
}
