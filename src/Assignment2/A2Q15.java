package Assignment2;

import java.util.Scanner;

public class A2Q15 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = n + 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int k=1; k<=gap; k++){
                System.out.print(" ");
            }
            for (int l=i; l>=1; l--){
                if (l!=n){
                    System.out.print(l);
                }
            }
            System.out.println();
            gap-=2;
        }
    }
}
