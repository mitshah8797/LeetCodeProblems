package Array;

import Util.InputHelper;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 < 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    if (j - 1 < 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        int[][] grid = InputHelper.stringTo2DIntegerArray(args);
        IslandPerimeter o = new IslandPerimeter();

        System.out.println("Perimeter: " + o.islandPerimeter(grid));
    }
}
