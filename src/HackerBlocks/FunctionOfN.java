package HackerBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        while (n>0){
            int sum = 0;
            long num = scanner.nextLong();
            for (int i = 1; i <= num; i++) {
                if (i%2==0){
                    sum = sum + i;
                } else {
                    sum = sum - i;
                }
            }
            System.out.println(sum);
            n--;
        }
    }
}
