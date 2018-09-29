package HackerBlocks;

import java.util.ArrayList;
import java.util.Scanner;

public class AsciiSubSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        String string = scanner.next();*/
        ArrayList<String> list = printSubsequence("", "ab");
        System.out.println(list.size());
        for (String str : list){
            System.out.print(str + " ");
        }
    }

    private static ArrayList<String> printSubsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> sol = new ArrayList<>();

        sol.addAll(printSubsequence(processed, unprocessed.substring(1)));
        sol.addAll(printSubsequence(processed + ch, unprocessed.substring(1)));
        sol.addAll(printSubsequence(processed + (int)ch, unprocessed.substring(1)));

        return sol;
    }
}
