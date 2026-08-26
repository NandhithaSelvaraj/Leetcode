/*
 * Problem: 867. Transpose Matrix
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/transpose-matrix/submissions/2120961258/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-08-26
 */

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
