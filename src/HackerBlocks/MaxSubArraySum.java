package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArraySum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        while (k>0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println(findMaxSumSubarray(a));
            k--;
        }

    }

    private static int findMaxSumSubarray(int[][] a) {
        int left = 0;
        int right = 0;
        int currentSum = 0;

        int maxSum = 0;

        while (left < a[0].length){
            right = left;
            int temp[] = new int[a.length];
            while (right < a[0].length){
                for (int i = 0; i < a.length; i++) {
                    temp[i] = temp[i] + a[i][right];
                }

                currentSum = kadaneAlgorithm(temp);

                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
                right++;
            }
            left++;
        }
        return maxSum;
    }

    private static int kadaneAlgorithm(int[] temp) {
        int currentMax = temp[0];
        int max = temp[0];

        for (int i = 1; i < temp.length; i++) {
            currentMax = Math.max(temp[i], temp[i] + currentMax);
            if (currentMax > max){
                max = currentMax;
            }
        }
        return max;
    }
}