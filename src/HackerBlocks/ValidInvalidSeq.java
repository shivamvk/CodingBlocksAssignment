package HackerBlocks;

import java.util.Scanner;

public class ValidInvalidSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y;
        boolean dec = true;
        boolean yes = true;
        while (n > 1) {
            y = scanner.nextInt();
            if (y > x && dec){
                dec = false;
            }

            if (y < x && !dec){
                yes = false;
                break;
            }
            x = y;
            n--;
        }

        System.out.println(yes);
    }
}
