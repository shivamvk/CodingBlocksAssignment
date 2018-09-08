package Practice;

public class Sep8 {
    public static void main(String[] args) {
        int nums[][] = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        printSpiralPrint(nums);
    }

    private static void printSpiralPrint(int[][] nums) {
        int left = 0;
        int top = 0;
        int bottom = nums.length;
        int right = nums[0].length;

        while (left<=right && top<=bottom){
            for (int i = left; i < right; i++) {
                System.out.println(nums[top][i]);
            }

            for (int i = top+1; i < bottom-1; i++) {
                System.out.println(nums[i][right-1]);
            }

            for (int i = right - 1; i >= left; i--) {
                System.out.println(nums[bottom-1][i]);
            }

            for (int i = bottom - 2; i > top ; i--) {
                System.out.println(nums[i][left]);
            }

            left++;
            top++;
            bottom--;
            right--;
        }
    }
}
