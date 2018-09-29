package HackerBlocks;

import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();

        for (int i = start; i <= end; i+=step) {
            float cel = (float)(5.00/9.00)*(i-32);
            System.out.println(i + " " + (int)cel);
        }
    }
}
