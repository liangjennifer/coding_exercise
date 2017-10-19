/**
 * Created by jliang1 on 10/15/17.
 *
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 Example:

 [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

 Answer: 16

 https://leetcode.com/problems/island-perimeter/description/
 */
public class IslandPerameters {

    public static int islandPerimeter(int[][] grid) {
        int totalsquares = 0;
        int adjacentsquares = 0;
        int previous = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    totalsquares++;
                    if (previous == 1)
                        adjacentsquares++;
                }
                previous = grid[i][j];
            }
            previous=0;
        }

        previous = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 1) {
                    if (previous == 1)
                        adjacentsquares++;
                }
                previous = grid[j][i];
            }
            previous = 0;
        }

        return (totalsquares*4 - adjacentsquares*2);
    }

    public static void main(String[] args) {

        int[][] n = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(IslandPerameters.islandPerimeter(n));
    }
}
