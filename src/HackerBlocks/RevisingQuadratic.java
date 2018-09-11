package HackerBlocks;

import java.util.Scanner;

public class RevisingQuadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = b*b-4*a*c;

        if (d < 0){
            System.out.println("Imaginary");
        } else {
            double x = ((double)-1*b - Math.sqrt(d))/2*a;
            double y = ((double)-1*b + Math.sqrt(d))/2*a;
            if (x == y){
                System.out.println("Real and Equal");
                System.out.print(x + " " + y);
            } else {
                System.out.println("Real and Distinct");
                System.out.print(x + " " + y);
            }
        }
    }
}
