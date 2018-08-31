package Assignment1;
import java.util.Scanner;

public class A1Q5 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        if (x == y){
            if (x%2 == 0){
                System.out.println("Value at point (" + x + "," + y +") is " + x*2);
            } else {
                int a = x-1;
                System.out.println("Value at point (" + x + "," + y +") is " + ((a*2)+1));
            }
        } else if (x>y){
            if (x%2 == 0 && y%2 ==0){
                System.out.println("Value at point (" + x + "," + y +") is " + (x+y));
            } else if (x%2 != 0 && y%2 !=0){
                int a = x-1;
                int b = y-1;
                System.out.println("Value at point (" + x + "," + y +") is " + ((a+b) + 1));
            } else {
                System.out.println("Value at point (" + x + "," + y +") is not present");
            }
        } else {
            System.out.println("Value at point (" + x + "," + y +") is not present");
        }
    }
}
