package HackerBlocks;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        int a[] = {4, 0, 2, 1, 3};
        int b[] = {1, 3, 2, 4, 0};
        boolean inverse = true;
        for (int i = 0; i < a.length; i++) {
            if (b[a[i]] != i){
                inverse = false;
            }
        }
        if (inverse){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
