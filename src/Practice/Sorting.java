package Practice;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int a[] = {2, 14, -18, 7};
        quick(a, 0, a.length);
        Utility.display(a);
    }

    private static void quick(int[] nums, int start, int end){
        if (end <= start){
            return;
        }

        int pivot = end - 1;

        pivot = pivotAdjust(nums, start, end, pivot);

        quick(nums, start, pivot);
        quick(nums, pivot + 1, end);
    }

    private static int pivotAdjust(int[] nums, int start, int end, int pivot) {
        int i = start;
        int j = start;

        for (i = start; i < pivot; i++){
            if (nums[i] < nums[pivot]){
                Utility.swap(nums, i, j);
                j++;
            }
        }

        Utility.swap(nums, j, pivot);
        return j;
    }

    private static void mergeSortModified(int[] nums, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end)/2;

        mergeSortModified(nums, start, mid);
        mergeSortModified(nums, mid, end);

        mergeModified(nums, start, mid, end);
    }

    private static void mergeModified(int[] nums, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;

        int mix[] = new int[end - start];

        while (i < mid && j < end){
            if (nums[i] < nums[j]) {
                mix[k++] = nums[i++];
            } else {
                mix[k++] = nums[j++];
            }
        }

        while (i < mid) {
            mix[k++] = nums[i++];
        }

        while (j < end) {
            mix[k++] = nums[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            nums[start + l] = mix[l];
        }
    }

    private static int[] mergeSort(int[] nums){
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length/2;

        int first[] = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int second[]= mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i=0,j=0,k=0;

        while (i < first.length && j < second.length){
            if (first[i] <= second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    private static void bubbleSort(int[] nums){

        //run the loop n-1 times
        for (int i = 0; i < nums.length; i++) {

            //reduce items from last
            for (int j = 1; j < nums.length - i; j++) {

                //swap if next item is smaller than previous
                if (nums[j] < nums[j-1]){
                    Utility.swap(nums, j, j-1);
                }
            }
        }
    }

    private static void selectionSort(int[] nums){
        for (int i=0; i<nums.length; i++){
            int last = nums.length - i - 1;

            int max = Utility.findMax(nums, 0, last);

            Utility.swap(nums, max, last);
        }
    }

    private static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--){
                if (nums[j] < nums[j-1]){
                    Utility.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static void reverse(int[] nums){
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }

    private static int[] inverse(int[] nums){
        int[] data = new int[nums.length];

        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];

            data[v] = p;
        }

        return data;

    }
}
