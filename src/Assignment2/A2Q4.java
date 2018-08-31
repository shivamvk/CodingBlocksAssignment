package Assignment2;
import java.util.Scanner;

public class A2Q4 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=2; i<n; i++){
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int i) {
        for (int j=2; j<=i/2; j++){
            if (i%j == 0){
                return false;
            }
        }
        return true;
    }
}
