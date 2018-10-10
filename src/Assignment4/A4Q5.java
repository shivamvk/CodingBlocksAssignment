package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class A4Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(inverse(arr));
    }

    private static String inverse(int[] arr) {
        int brr[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           brr[arr[i]]=i;
        }
        return Arrays.toString(brr);
    }
}
