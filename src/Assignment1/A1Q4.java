package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1Q4 {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<=n; i++){
            list.add(i);
        }
        while (list.size() != 1){
            for (int i=0; i<list.size(); i++){
                if (i%2 == 0){
                    list.set(i, 0);
                }
            }
            for (int i=0; i<list.size(); i++){
                if (list.get(i) == 0){
                    list.remove(i);
                }
            }
        }
        System.out.print(list.get(0));
    }
}
