package Assignment3;

import java.util.Scanner;

public class A3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int octal = scanner.nextInt();

        System.out.println(octalToBinary(octal));
    }

    private static int octalToBinary(int octal) {
        int bin = 0;
        int k = 0;
        while (octal>0){
            int rem = octal%2;
            octal = octal/2;
            bin = bin + ((int)Math.pow(10, k)*rem);
            k++;
        }
        return bin;
    }
}
