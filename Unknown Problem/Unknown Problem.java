/*
 * Problem: Unknown Problem
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/find-words-containing-character/submissions/2096540487/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-08-06
 */

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<words.length;i++) {
            if(words[i].indexOf(x) != -1){
                result.add(i);
            }
        }
        return result;
    }
}
