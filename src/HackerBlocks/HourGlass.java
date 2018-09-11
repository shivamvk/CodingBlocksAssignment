package HackerBlocks;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = 0;
        for(int i=n; i>=0; i--){
            for(int j=0; j<gap; j++){
                System.out.print("  ");
            }
            for (int j = i; j >=0 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            gap++;
            System.out.println();
        }
        gap = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < gap; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j+ " ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            gap--;
            System.out.println();
        }
    }
}
