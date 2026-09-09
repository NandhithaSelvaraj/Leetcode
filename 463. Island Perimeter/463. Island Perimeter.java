/*
 * Problem: 463. Island Perimeter
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/island-perimeter/submissions/2136506861/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-09-09
 */

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {
                    perimeter += 4;

                    // Land cell above
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }

                    // Land cell on the left
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}
