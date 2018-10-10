package Assignment4;

import java.util.Scanner;

public class A4Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter M:");
        int m=scanner.nextInt();
        int pos=0;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (m==arr[i]) {
                pos = i;
                flag = true;
            }
        }
        if (flag==false)
            pos=-1;
        System.out.println(pos);
    }
}
