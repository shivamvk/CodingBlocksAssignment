package Assignment2;

import java.util.Scanner;

public class A2Q9 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            System.out.println((int)(Math.pow(11,i)));
        }
    }
}
