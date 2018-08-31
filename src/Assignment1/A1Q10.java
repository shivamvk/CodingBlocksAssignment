package Assignment1;
import java.util.Scanner;

public class A1Q10 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print(GCD(x,y));
    }

    private static int GCD(int x, int y) {
        if (y == 0){
            return x;
        }
        return GCD(y, x%y);
    }
}
