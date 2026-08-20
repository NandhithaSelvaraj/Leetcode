/*
 * Problem: 387. First Unique Character in a String
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/first-unique-character-in-a-string/submissions/2114099540/
 * Language: java
 * Date: 2026-08-20
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        
        // Step 1: Count how many times each character appears
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // Step 2: Go through the string again, find first char with count == 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
