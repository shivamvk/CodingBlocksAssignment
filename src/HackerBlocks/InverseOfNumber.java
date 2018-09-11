package HackerBlocks;

public class InverseOfNumber {
    public static void main(String[] args) {
        String stnum = "4213"; //12543
        int num = Integer.parseInt(stnum);
        int a[] = new int[stnum.length()];
        int k = 1;
        while (num>0){
            int rem = num%10;
            num = num/10;
            a[stnum.length() - rem] = k;
            k++;
        }
        for (int i : a){
            System.out.print(i);
        }
    }
}
