package Assignment1;

import java.util.Scanner;

public class A1Q7 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = 1;
        for (int i=1; i<=n/2+1; i++){
            for (int j=1; j<=n/2+2-i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=gap; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n/2+2-i; j++){
                System.out.print("*");
            }
            System.out.println();
            gap+=2;
        }
        gap-=3;
        for (int i=1; i<=n/2; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<gap; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i+1; j++){
                System.out.print("*");
            }
            gap-=2;
            System.out.println();
        }
    }
}
