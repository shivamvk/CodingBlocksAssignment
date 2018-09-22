package Assignment7;

import java.util.Scanner;

public class A7Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int i = Integer.parseInt(string);
        System.out.println(sumOfDigits(i, 0));
    }

    private static int sumOfDigits(int i, int sum) {
        if (i <= 0){
            return sum;
        }

        int rem = i%10;

        return sumOfDigits(i/10, sum + rem);

    }
}
