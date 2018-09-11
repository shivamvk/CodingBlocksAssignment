package HackerBlocks;

public class GaneshaPattern {
    public static void main(String[] args) {
        int n = 7;
        int gap = (n-2)/2;
        for (int i = 0; i < n/2; i++) {
            System.out.print("*");
            for (int j = 0; j < gap; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-gap-1; j++) {
                if (i==0){
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    break;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        gap = (n-2)/2 + 1;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j <= gap; j++) {
                if (j == gap){
                    System.out.print("*");
                    break;
                }
                if (i == n/2-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= gap-1; j++) {
                if (j == gap-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
