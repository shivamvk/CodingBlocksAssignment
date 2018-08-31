package Assignment2;

import java.util.Scanner;

public class A2Q14 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap = n-1;
        for (int i=1; i<=n; i++){
            int k = i;
            for (int j=0; j<gap; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(k);
                k++;
            }
            k-=2;
            for (int l=1; l<i; l++){
                System.out.print(k);
                k--;
            }
            System.out.println();
            gap--;
        }

        gap = 1;

        for (int i=1; i<n; i++){
            for (int j=1; j<=gap; j++){
                System.out.print(" ");
            }
            int l = n-i;
            for (int k=1; k<=n-i; k++){
                System.out.print(l);
                l++;
            }
            l-=2;
            for (int m=1; m<n-i; m++){
                System.out.print(l);
                l--;
            }
            gap++;
            System.out.println();
        }
    }
}
