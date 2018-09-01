package Assignment2;

import java.util.Scanner;

public class A2Q10 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x=0,y=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(x + " ");
                int m = x;
                x = x + y;
                y = m;
            }
            System.out.println();
        }
    }
}
