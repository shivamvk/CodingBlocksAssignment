package Practice;

import java.util.Scanner;

public class Sep9 {
    public static void main(String[] args) {
        //String string = "shivambhasin";
        //System.out.println(joindiff(string));

        /*System.out.println(frequency(string));

        //printIncreasing(10);

        System.out.println(factorial(5));

        System.out.println(fibonacci(10));*/
        
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int a[] = new int[(int)n];
        for (int i = 0; i < (int)n; i++) {
            a[i] = scanner.nextInt();
            int sum =0;
            for (int j = 1; j <= a[i]; j++) {
                sum = sum + (int)Math.pow(-1, j)*j;
            }
            System.out.println(sum);
        }

    }

    private static int fibonacci(int i) {
        if (i <= 1){
            return i;
        }

        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    private static int factorial(int i) {
        if (i == 0){
            return 1;
        }

        return i * factorial(i-1);
    }

    private static void printIncreasing(int i) {
        if (i == 0){
            return;
        }

        if (i%2==0){
            System.out.println(i);
        }
        printIncreasing(i - 1);
        if (i%2!=0){
            System.out.println(i);
        }
    }

    private static String frequency(String string) {
        StringBuilder builder = new StringBuilder();
        char ch[] = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!arraycontains(ch[i], builder.toString().toCharArray())){
                builder.append(ch[i]);
                int count = 1;
                for (int j = i+1; j < ch.length; j++) {
                    if (ch[i] == ch[j]){
                        count++;
                    }
                }
                builder.append(count);
            }
        }
        return builder.toString();
    }

    private static boolean arraycontains(char cha, char ch[]) {
        for (char aCh : ch) {
            if (aCh == cha) {
                return true;
            }
        }
        return false;
    }

    private static String joindiff(String string){
        StringBuilder builder = new StringBuilder();
        builder.append(string.charAt(0));

        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);
            char last = builder.charAt(builder.length() - 1);
            int diff = Math.abs(last - ch);
            builder.append(diff);
            builder.append(ch);
        }

        return builder.toString();
    }
}
