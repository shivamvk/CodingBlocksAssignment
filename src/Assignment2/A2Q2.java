package Assignment2;

import java.util.Scanner;

public class A2Q2 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0,j=1,k=0; k<n; k+=2){
            System.out.print(i + " " + j + " ");
            i = i + j;
            j = j + i;
        }
    }
}
