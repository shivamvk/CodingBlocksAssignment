package Assignment1;
import java.util.Scanner;

public class A1Q1 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i,j;
        int num;
        int gap;

        gap = n-1;

        for (j =1; j<=n; j++){
            num = j;
            for (i=1; i<=gap; i++){
                System.out.print(" ");
            }
            gap--;
            for (i=1; i<=j; i++){
                System.out.print(num);
                num++;
            }
            num-=2;
            for (i=1; i<j; i++){
                System.out.print(num);
                num--;
            }
            System.out.println();
        }

    }
}
