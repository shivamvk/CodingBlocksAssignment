package HackerBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringRemove {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(remove(scanner.next()));
    }

    private static String remove(String string){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); ) {
            int k = i + 1;
            while (k < string.length() && string.charAt(k) == string.charAt(i)){
                k++;
            }
            builder.append(string.charAt(i));
            i = k;
        }
        return builder.toString();
    }
}
