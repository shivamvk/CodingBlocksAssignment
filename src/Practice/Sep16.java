package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Sep16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(numberOfWaysInMaze(3, 3));
        System.out.println(getAllPathsInMaze(3, 3, ""));

        //System.out.println(WaysInMazeWithDiagonalMovement(3, 3));
    }

    private static int numberOfWaysInMaze(int row, int col) {
        if (row == 1 || col == 1){
            return 1;
        }

        return numberOfWaysInMaze(row -1, col) + numberOfWaysInMaze(row, col -1);
    }

    private static ArrayList<String> getAllPathsInMaze(int row, int col, String path){
        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();

        if (row > 1) {
            result.addAll(getAllPathsInMaze(row -1, col, path + "V"));
        }

        if (col > 1) {
            result.addAll(getAllPathsInMaze(row, col - 1, path + "H"));
        }

        if (row > 1 && col > 1){
            result.addAll(getAllPathsInMaze(row - 1, col -1, path + "D"));
        }

        return result;
    }

    private static int WaysInMazeWithDiagonalMovement(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return WaysInMazeWithDiagonalMovement(row - 1, col)
                + WaysInMazeWithDiagonalMovement(row, col - 1)
                + WaysInMazeWithDiagonalMovement(row - 1, col - 1);
    }
}
