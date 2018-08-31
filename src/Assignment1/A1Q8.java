package Assignment1;
import java.util.Scanner;

public class A1Q8 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0,j=1,k=0; j<n; k+=2){
            System.out.print(i + " " + j + " ");
            i = i + j;
            j = j + i;
        }
    }
}
