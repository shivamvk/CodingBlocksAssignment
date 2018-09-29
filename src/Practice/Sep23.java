package Practice;

public class Sep23 {
    public static void main(String[] args) {
        //System.out.println(fiboItrDP(10, new int[11]));
        //System.out.println(countBoardRec(10, 6));
        //System.out.println(countBoardItrDP(10, 4));

        //System.out.println(countMazePathsRec(100, 100));

        System.out.println(countMazePathsRecDP(100, 100, new long[101][101]));

        System.out.println(countMazePathsItrDP(100,100));
    }

    private static long printFibo(int n, long[] mem) {
        if (n < 2){
            return n;
        }

        if (mem[n] != 0){
            return mem[n];
        }

        mem[n] = printFibo(n-1, mem) + printFibo(n-2, mem);

        return mem[n];
    }

    private static int fiboItrDP(int n, int[] mem){
        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <= n; i++){
            mem[i] = mem[i-1] + mem[i-2];
        }

        return mem[n];
    }

    private static int countBoardRec(int unprocessed, int faces) {
        if (unprocessed == 0){
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= faces && i <= unprocessed; i++) {
            count+=countBoardRec(unprocessed - i, faces);
        }

        return count;
    }

    private static int countBoardItrDP(int target, int faces){
        int mem[] = new int[target+1];

        mem[0] = 1;

        for (int localTarget = 1; localTarget <= target; localTarget++) {
            int count = 0;

            for (int face = 1; face <= faces && face <= localTarget; face++) {
                count+=mem[localTarget-face];
            }

            mem[localTarget] = count;
        }

        return mem[target];
    }

    private static int countMazePathsRec(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return countMazePathsRec(row - 1, col) + countMazePathsRec(row, col - 1);
    }

    private static long countMazePathsRecDP(int row, int col, long[][] mem) {
        if (row == 1 || col == 1){
            return 1;
        }

        if (mem[row][col] != 0){
            return mem[row][col];
        }

        mem[row][col] = countMazePathsRecDP(row-1,col,mem) + countMazePathsRecDP(row,col-1,mem);

        return mem[row][col];
    }

    private static long countMazePathsItrDP(int row, int col){
        long mem[][] = new long[row+1][col+1];

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if (r == 1 || c == 1){
                    mem[r][c] = 1;
                } else {
                    mem[r][c] = mem[r-1][c] + mem[r][c-1];
                }
            }
        }

        return mem[row][col];
    }

}
