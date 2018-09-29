package HackerBlocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermutationsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = getCount(scanner.next(), "");
        System.out.println(list.size());
        Collections.sort(list);
        for (String str : list){
            System.out.print(str + " ");
        }
    }

    private static ArrayList<String> getCount(String unprocessesed, String processed) {
        if (unprocessesed.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessesed.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);

            ans.addAll(getCount(unprocessesed.substring(1), first + ch + second));
        }

        return ans;

    }
}
