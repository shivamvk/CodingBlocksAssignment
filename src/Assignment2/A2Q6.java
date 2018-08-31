package Assignment2;

import java.util.Scanner;

public class A2Q6 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int even=0,odd=0;
        int i = 1;
        while (n != 0){
            int rem = n%10;
            n = n/10;
            if (i%2==0){
                even = even + rem;
            } else {
                odd = odd + rem;
            }
            i++;
        }
        System.out.print("Even sum is " + even);
        System.out.println();
        System.out.print("Odd sum is " + odd);
    }
}
