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

        //prime number
        int num = scanner.nextInt();
        if (isPrime(num)){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

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
