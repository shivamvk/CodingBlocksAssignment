package Assignment3;

import java.util.Scanner;

public class A3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dec = scanner.nextInt();

        System.out.println(decToOctal(dec));
    }

    private static int decToOctal(int dec) {
        int bin = 0;
        int k = 0;
        while (dec>0){
            int rem = dec%8;
            dec = dec/8;
            bin = bin + ((int)Math.pow(10, k)*rem);
            k++;
        }
        return bin;
    }
}
