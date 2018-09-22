package Practice;

import java.util.Scanner;

public class RatInAMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean maze[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        findAllPathsWithAllDirections(maze, 0, 0, "");
    }

    private static void findaAllPaths(boolean[][] maze, int row, int col, String path) {
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if (!maze[row][col]){
            return;
        }

        if (row < maze.length -1) {
            findaAllPaths(maze, row + 1, col, path + "V");
        }

        if (col < maze[0].length - 1){
            findaAllPaths(maze, row, col + 1, path + "H");
        }
    }

    private static void findAllPathsWithAllDirections(boolean[][] maze, int row, int col, String path) {
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if (!maze[row][col]){
            return;
        }

        maze[row][col] = false;

        if (row < maze.length - 1){
            findAllPathsWithAllDirections(maze, row + 1, col, path + "D");
        }

        if (col < maze[0].length - 1){
            findAllPathsWithAllDirections(maze, row, col + 1, path + "R");
        }

        if (col > 0){
            findAllPathsWithAllDirections(maze, row, col - 1, path + "L");
        }

        if (row > 0){
            findAllPathsWithAllDirections(maze, row - 1, col, path + "U");
        }

        maze[row][col] = true;
    }
}
