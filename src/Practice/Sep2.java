package Practice;

public class Sep2 {
    public static void main(String[] args) {
        /*int data[] = {4, 2, 0, 5, 3, 1};

        Utility.display(Sorting.inverse(data));*/

        int[][] nums = {{2, 4, 1},{3, 9, 0}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
