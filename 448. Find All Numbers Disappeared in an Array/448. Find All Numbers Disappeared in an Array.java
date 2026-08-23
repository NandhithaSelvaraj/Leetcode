/*
 * Problem: 448. Find All Numbers Disappeared in an Array
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/2117354453/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-08-23
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        for(int x : nums){
            seen[x - 1] = true;
        }
        for  (int i=0; i<seen.length; i++){
            if(!seen[i]){
                ans.add(i +1);
            }
        }
        return ans;
    }
}
