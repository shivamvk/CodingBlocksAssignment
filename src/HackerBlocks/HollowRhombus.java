package HackerBlocks;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < gap; j++) {
                System.out.print(" ");
            }
            if (i==0 || i==n-1){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            gap--;
            System.out.println();
        }
    }
}
