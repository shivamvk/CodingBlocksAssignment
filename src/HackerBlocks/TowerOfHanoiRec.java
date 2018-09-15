package HackerBlocks;

import java.util.Scanner;

public class TowerOfHanoiRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        towerOfHanoi(n, "A", "C", "B");
    }

    private static void towerOfHanoi(int n, String from, String to, String empty) {
        if (n == 1){
            System.out.println("Move ring 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n-1, from, empty, to);
        System.out.println("Move ring " + n + " from " + from + " to " + to);
        towerOfHanoi(n-1, empty, to, from);
    }
}
