/*
 * Problem: Unknown Problem
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/submissions/2158063123/
 * Language: java
 * Date: 2026-09-30
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length;i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }
}
