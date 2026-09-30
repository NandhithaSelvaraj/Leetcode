/*
 * Problem: 2529. Maximum Count of Positive Integer and Negative Integer
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/submissions/2158034579/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-09-30
 */

class Solution {
    public int maximumCount(int[] nums) {
       int pos = 0;
       int neg = 0;
       for (int num : nums) {
        if (num > 0) {
            pos++;
        } else if (num < 0) {
            neg++;
        }
       }
       return Math.max(pos,neg);
    }
}
