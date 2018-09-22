package Assignment7;

import java.util.Scanner;

public class A7Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(insertAstrick(string, 0, ""));
    }

    private static String insertAstrick(String string, int i, String ans) {
        if (i >= string.length() - 1){
            return ans;
        }

        ans = ans + string.charAt(i);

        if (i + 1 >= string.length() - 1){
            if (string.charAt(i) == string.charAt(i + 1)){
                ans = ans + "*";
            }
            ans = ans + string.charAt(i + 1);
            return ans;
        }

        if (string.charAt(i) == string.charAt(i + 1)){
            ans = ans + "*";
        }

        return insertAstrick(string, i + 1, ans);
    }
}
