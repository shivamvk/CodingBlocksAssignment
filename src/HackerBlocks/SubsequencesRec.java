package HackerBlocks;

import java.util.Scanner;

public class SubsequencesRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printAllSubsequence("", scanner.next());
    }

    private static void printAllSubsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        printAllSubsequence(processed + ch, unprocessed.substring(1));
        printAllSubsequence(processed, unprocessed.substring(1));
    }
}
