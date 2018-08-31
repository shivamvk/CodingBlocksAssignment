package Assignment2;
import java.util.Scanner;

public class A2Q11 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gap;
        if (n%2 == 0){
            gap = n - n/2;
        } else {
            gap = n - n/2 - 1;
        }
        for (int i=1; i<=n/2; i++){
            for (int j=0; j<gap; j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
            gap--;
        }
        gap = 0;
        for (int i=n/2+1; i>0; i--){
            for (int j=0; j<gap; j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
            gap++;
        }
    }
}
