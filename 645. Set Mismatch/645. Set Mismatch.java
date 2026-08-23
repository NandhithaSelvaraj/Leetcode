/*
 * Problem: 645. Set Mismatch
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/set-mismatch/submissions/2117387893/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-08-23
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        int missing = 0;
        boolean[] seen = new boolean[nums.length];
        for (int x : nums){
            if (seen[x -1]){
                duplicate = x;
            }else {
                seen[x -1] = true;
            }
        }
        for (int i = 0; i<seen.length;i++){
            if(!seen[i]){
                missing = i + 1;
            }
        }
        return new int[]{duplicate,missing};
    }
}
