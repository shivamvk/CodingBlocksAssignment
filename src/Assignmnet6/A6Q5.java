package Assignmnet6;

import java.util.Scanner;

public class A6Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println(nthTriangle(n,sum));
    }

    private static int nthTriangle(int n, int sum) {
        if (n==0){
            return sum;
        }

        sum = sum + n;

        return nthTriangle(n-1, sum);
    }
}
