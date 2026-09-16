/*
 * Problem: 1662. Check If Two String Arrays are Equivalent
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/2143761345/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-09-16
 */

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1 = "";
        String str2 = "";

        for (String word : word1) {
            str1 = str1 + word;
        }

        for (String word : word2) {
            str2 = str2 + word;
        }

        return str1.equals(str2);
    }
}
