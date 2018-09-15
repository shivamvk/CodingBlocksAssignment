package HackerBlocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicalString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string  = scanner.next();
        int arr[] = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(doTheMagic(string, arr));
    }

    private static int doTheMagic(String string, int[] arr) {
        int count = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String  s = string.substring(i, j);
                boolean bool = true;
                int length = s.length();
                while (length > 0){
                    if (arr[s.charAt(length - 1) - 97] < s.length()){
                        bool = false;
                    }
                    length--;
                }
                if (bool && !list.contains(s)){
                    System.out.println(s);
                    list.add(s);
                    count++;
                }
            }
        }
        return count;
    }
}
