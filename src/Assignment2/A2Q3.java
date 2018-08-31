package Assignment2;

import java.util.Scanner;

public class A2Q3 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int revnum = 0;
        while (n != 0){
            int rem = n%10;
            n = n/10;
            revnum = revnum*10 + rem;
        }
        System.out.println(revnum);
    }
}
