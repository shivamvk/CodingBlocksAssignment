package Assignment2;

import java.util.Scanner;

public class A2Q8 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
            for (int j=1; j<i; j++){
                if (i == j+1){
                    System.out.print(i + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
