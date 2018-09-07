package Practice;

public class Searching {

    static int linearSearch(int[] num, int data){
        for (int i=0; i< num.length; i++){
            if (num[i] == data){
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] num, int data){
        int start = 0;
        int end = num.length - 1;
        int mid;

        while (start <= end){
            mid = (start + end)/2;

            if (num[mid] == data){
                return mid;
            }

            if (num[mid] > data){
                end = mid-1;
            } else if (num[mid] < data){
                start = mid+1;
            }
        }
        return -1;
    }
}
