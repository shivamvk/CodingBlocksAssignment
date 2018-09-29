package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean board[][] = new boolean[n][n];
        //false is safe and true is unsafe
        nqueens(board, 0);
        //nKnights(board, 0, 0, 6);
    }

    private static void nqueens(boolean[][] board, int row) {
        if (row == board.length){
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                //place your queen here
                board[row][col] = true;

                nqueens(board, row + 1);

                board[row][col] = false;
            }
        }
    }

    private static void display(boolean[][] board) {
        for (boolean[] aBoard : board) {
            for (int j = 0; j < board.length; j++) {
                if (aBoard[j]) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("X\t");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        //DIAG LEFT
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        //DIAG RIGHT
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void nKnights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0){
            display(board);
            return;
        }

        if (row == board.length - 1 && col == board.length){
            return;
        }

        if (col == board.length){
            nKnights(board, row + 1, col, knights);
            return;
        }

        if (isSafeForKnights(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
    }

    private static boolean isSafeForKnights(boolean[][] board, int row, int col) {
        if (row-2>=0 && col+1 < board.length && board[row-2][col+1]){
            return false;
        }

        if (row-2>=0 && col-1 >= 0 && board[row-2][col-1]){
            return false;
        }

        if (row-1>=0 && col-2 >= 0 && board[row-1][col-2]){
            return false;
        }

        if (row-1>=0 && col+2 < board.length && board[row-1][col+2]){
            return false;
        }

        return true;
    }

}
