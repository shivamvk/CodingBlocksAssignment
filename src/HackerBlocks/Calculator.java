package HackerBlocks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        do {
            char ch = scanner.next().charAt(0);
            switch(ch){
                case '+':
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(a+b);
                    break;

                case '-':
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    System.out.println(x-y);
                    break;

                case '*':
                    int i = scanner.nextInt();
                    int j = scanner.nextInt();
                    System.out.println(i*j);
                    break;

                case '/':
                    int m = scanner.nextInt();
                    int n = scanner.nextInt();
                    System.out.println(m/n);
                    break;

                case 'X':
                    bool = false;
                    break;

                case 'x':
                    bool = false;
                    break;

                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }
        } while (bool);
    }
}
