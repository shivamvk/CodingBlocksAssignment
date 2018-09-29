package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int noOfQueries = scanner.nextInt();
        while (noOfQueries>0){
            int query = scanner.nextInt();
            a = implementTheQuery(a,query);
            noOfQueries--;
        }
        int sum = 0;
        for (int i : a){
            sum+=i;
        }
        System.out.println(sum);
    }

    private static int[] implementTheQuery(int[] a, int query) {
        int temp[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int i1 = i - query;
            if (i1 < 0){
                i1 = i1 + a.length;
            }
            temp[i] = a[i] + a[i1];
        }
        return temp;
    }
}
