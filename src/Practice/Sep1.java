package Practice;

import java.util.Scanner;

public class Sep1 {
    public static void main(String ar[]){

        Scanner scanner = new Scanner(System.in);

        /*//converting from f to c
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();
        converter(start, end, step);*/

        /*//prime number
        int num = scanner.nextInt();
        if (isPrime(num)){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }*/

        /*//converting from decimal to binary
        int dec = scanner.nextInt();
        System.out.println(decToBin(dec));*/

        //converting from binary to decimal
        int bin = scanner.nextInt();
        System.out.println(binToDec(bin));

    }

    private static int binToDec(int bin) {
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

    private static int decToBin(int dec) {
        int bin = 0;
        int k = 0;
        while (dec>0){
            int rem = dec%2;
            dec = dec/2;
            bin = bin + ((int)Math.pow(10, k)*rem);
            k++;
        }
        return bin;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    private static void converter(int start, int end, int step) {
        for (int i = start; i <= end; i+=step) {
            System.out.println((5f/9)*(i-32));
        }
    }
}
