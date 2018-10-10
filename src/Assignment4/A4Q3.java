package Assignment4;

import java.util.Scanner;

public class A4Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter M:");
        int m=scanner.nextInt();
        int beg,mid,end;
        int pos=0;
        beg=0;
        end=arr.length-1;
        mid=(beg+end)/2;
        while (beg<=end)
        {
            if (arr[mid]==m) {
                pos = mid;
                break;
            }
            else if (arr[mid]>m)
                end=mid-1;
            else
                beg=mid+1;
            mid=(beg+end)/2;
        }
        if (beg>end)
            pos=-1;
        System.out.println(pos);
    }
}
