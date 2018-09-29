package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Sep15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //printSubsequence("", scanner.next());
        //printAllPermutations("", scanner.next());
        //printAllBoardPoints("", scanner.nextInt());
        //printAllBoardPoints("", scanner.nextInt(), scanner.nextInt());
        //System.out.println(getSubsequence("", scanner.next()));
        printNumpadCombinations("", scanner.next());
        //System.out.println(getAllPermutations("", scanner.next()));
        //skip("", "kikibymicky");
        //System.out.println(skip("hitmanhitthehien"));

    }

    private static String skip(String string){
        if (string.isEmpty()){
            return "";
        }

        char ch = string.charAt(0);

        if (string.startsWith("hit")){
            return skip(string.substring(2));
        } else {
            return ch + skip(string.substring(1));
        }
    }

    private static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        if (ch == 'i'){
            skip(processed, unprocessed.substring(1));
        } else {
            skip(processed + ch , unprocessed.substring(1));
        }
    }

    private static ArrayList<String> getNumpadCombinations(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';

        ArrayList<String> result = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3; i++) {
            if (i == 26){
                continue;
            }
            char ch = (char) (i+'a');
            ArrayList<String> temp = getNumpadCombinations(processed + ch, unprocessed.substring(1));
            result.addAll(temp);
        }

        return result;
    }

    private static ArrayList<String> getSubsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if (!processed.isEmpty()){
                list.add(processed);
            }
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> l1 = getSubsequence(processed + ch, unprocessed.substring(1));
        ArrayList<String> l2 = getSubsequence(processed, unprocessed.substring(1));

        l1.addAll(l2);

        return l1;
    }

    private static ArrayList<String> getAllPermutations(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String last = processed.substring(i);

            ArrayList<String> temp = getAllPermutations(first + ch + last, unprocessed.substring(1));
            result.addAll(temp);
        }

        return result;
    }

    private static void printNumpadCombinations(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            if (i == 26){
                continue;
            }
            char ch = (char) (i+'a');printNumpadCombinations(processed + ch, unprocessed.substring(1));
        }

    }

    private static void printAllBoardPoints(String processed, int unprocessed) {
        if (unprocessed == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= unprocessed; i++) {
            printAllBoardPoints(processed + i, unprocessed - i);
        }
    }

    private static void printAllBoardPoints(String processed, int unprocessed, int faces) {
        if (unprocessed == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= faces && i <= unprocessed; i++) {
            printAllBoardPoints(processed + i, unprocessed - i, faces);
        }
    }

    private static void printAllPermutations(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String last = processed.substring(i);

            printAllPermutations(first + ch + last, unprocessed.substring(1));
        }
    }

    private static void printSubsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        printSubsequence(processed + ch, unprocessed.substring(1));
        printSubsequence(processed, unprocessed.substring(1));
    }
}
