package Assignment2;

import java.util.Scanner;

public class A2Q1 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrimeNumber(n)){
            System.out.print("Prime");
        } else {
            System.out.print("Not prime");
        }
    }

    private static boolean isPrimeNumber(int i) {
        for (int j=2; j<=i/2; j++){
            if (i%j == 0){
                return false;
            }
        }
        return true;
    }
}
