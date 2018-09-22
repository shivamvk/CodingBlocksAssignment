package Assignment7;

import java.util.Scanner;

public class A7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(isReverse(str1,str2,0));
    }

    private static boolean isReverse(String str1, String str2, int i) {
        if (str1.length() != str2.length()){
            return false;
        }

        if (i >= str1.length()/2+1){
            return true;
        }

        return str1.charAt(i) == str2.charAt(str2.length() - 1 - i) && isReverse(str1, str2, i + 1);
    }
}
