package Practice;

import java.util.Arrays;

public class RecursionInArrays {
    public static void main(String[] args) {
        int a[] = {11, 4, 15, 13, 8};

        /*System.out.println(isSorted(a, 0));
        System.out.println(findNum(a, 0, 8));
        System.out.println(findNumIndex(a, 0, 13));*/

        bubbleSort(a, a.length - 1, 1);

        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a, int row, int col) {
        if (row == 0){
            return;
        }

        if (col < row){
            if (a[col] > a[col+1]){
                int t = a[col];
                a[col] = a[col+1];
                a[col+1] = t;
            }
            bubbleSort(a, row, col+1);
        } else {
            bubbleSort(a, row-1, 0);
        }

    }

    private static int findNumIndex(int[] a, int index, int num) {
        if (index == a.length){
            return  -1;
        }

        if (a[index] == num){
            return index;
        }

        return findNumIndex(a, index + 1, num);
    }

    private static boolean findNum(int[] a, int index, int num) {
        if (index == a.length){
            return false;
        }

        return a[index]==num || findNum(a, index+1, num) ;
    }

    private static boolean isSorted(int[] a, int index) {
        if (index == a.length - 1){
            return true;
        }
        return a[index] <= a[index+1] && isSorted(a, index+1);
    }
}
