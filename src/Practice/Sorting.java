package Practice;

public class Sorting {

    static void bubbleSort(int[] nums){

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

    static void selectionSort(int[] nums){
        for (int i=0; i<nums.length; i++){
            int last = nums.length - i - 1;

            int max = Utility.findMax(nums, 0, last);

            Utility.swap(nums, max, last);
        }
    }

    static void insertionSort(int[] nums){
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

    static void reverse(int[] nums){
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }

    static int[] inverse(int[] nums){
        int[] data = new int[nums.length];

        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];

            data[v] = p;
        }

        return data;

    }
}
