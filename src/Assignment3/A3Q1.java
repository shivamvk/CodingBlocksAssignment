package Assignment3;

import java.util.Scanner;

public class A3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bin = scanner.nextInt();

        System.out.println(convertToDecimal(bin));
    }

    private static int convertToDecimal(int bin) {
        int dec = 0;
        int k = 0;
        while (bin>0){
            int rem = bin%10;
            bin = bin/10;
            dec = dec + ((int) Math.pow(2,k)*rem);
            k++;
        }
        return dec;
    }
}
