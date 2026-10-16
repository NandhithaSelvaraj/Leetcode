/*
 * Problem: 2916. Subarrays Distinct Element Sum of Squares II
 * Difficulty: Hard
 * Link: https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/submissions/2174064924/?envType=daily-question&envId=2026-10-16
 * Language: java
 * Date: 2026-10-16
 */

import java.util.*;

class Solution {
    public int sumCounts(int[] nums) {
        long mod = 1_000_000_007;
        long ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums[j]);

                long count = set.size();
                ans = (ans + count * count) % mod;
            }
        }

        return (int) ans;
    }
}
