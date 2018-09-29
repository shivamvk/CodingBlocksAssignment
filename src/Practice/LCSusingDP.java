package Practice;

import java.util.Scanner;

public class LCSusingDP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        //System.out.println(lcsUsingItrDP(str1, str2));

        System.out.println(lcsUsingRec(str1, str2));
    }

    private static int lcsUsingItrDP(String str1, String str2){
        int mem[][] = new int[str1.length()+1][str2.length()+1];

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    mem[i+1][j+1] = mem[i][j] + 1;
                } else {
                    mem[i+1][j+1] = Math.max(mem[i][j+1], mem[i+1][j]);
                }
            }
        }

        return mem[str1.length()][str2.length()];
    }

    private static int lcsUsingRec(String str1, String str2){
        if (str1.isEmpty() || str2.isEmpty()){
            return 0;
        }

        char f = str1.charAt(0);
        char s = str2.charAt(0);

        if (f == s){
            return 1 + lcsUsingRec(str1.substring(1), str2.substring(1));
        } else {
            return Math.max(lcsUsingRec(str1.substring(1), str2),
                    lcsUsingRec(str1, str2.substring(1)));
        }
    }

    private static int lcsUsingRecDP(String str1, String str2){
        return 0;
    }
}
