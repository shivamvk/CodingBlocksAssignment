package HackerBlocks;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = n;
        for (int line = 0; line <= n; line++) {
            for (int i = gap; i > 0; i--) {
                System.out.print("  ");
            }

            for (int i = 0; i <= line; i++) {
                System.out.print(binomialCoeff(line, i)+"   ");
            }
            gap--;
            System.out.println();
        }
    }

    private static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k){
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
