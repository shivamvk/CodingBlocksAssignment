package HackerBlocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum+=a[i];
        }
        sum/=2;
        boolean mem[][] = new boolean[n][sum+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sum +1 ; j++) {
                mem[i][0] = true;
                if (j == a[i]){
                    mem[i][j] = true;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < sum+1; j++) {
                if (j < a[i]){
                    mem[i][j] = mem[i-1][j];
                } else {
                    mem[i][j] = mem[i-1][j] || mem[i-1][j-a[i]];
                }
            }
        }
        System.out.println(6);
        printSubsetsRec(a, n-1, sum, new ArrayList<>(), mem);
    }

    private static void printSubsetsRec(int a[], int i, int sum,
                                ArrayList<Integer> list, boolean[][] mem) {
        if (i == 0 && sum != 0 && mem[0][sum]) {
            list.add(a[i]);
            display(list, a);
            list.clear();
            return;
        }

        if (i == 0 && sum == 0) {
            display(list, a);
            list.clear();
            return;
        }

        if (mem[i-1][sum]) {
            ArrayList<Integer> b = new ArrayList<>();
            b.addAll(list);
            printSubsetsRec(a, i-1, sum, b, mem);
        }

        if (sum >= a[i] && mem[i-1][sum-a[i]]) {
            list.add(a[i]);
            printSubsetsRec(a, i-1, sum-a[i], list, mem);
        }
    }

    private static void display(ArrayList<Integer> p, int[] a) {
        int temp[] = Arrays.copyOfRange(a, 0, a.length);
        Collections.sort(p);
        for (int i = 0; i < p.size(); i++) {
            System.out.print(p.get(i) + " ");
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == p.get(i)){
                    temp[j] = -1;
                    break;
                }
            }
        }
        System.out.print("and ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != -1){
                System.out.print(temp[i] + " ");
            }
        }
        System.out.println();
    }
}
