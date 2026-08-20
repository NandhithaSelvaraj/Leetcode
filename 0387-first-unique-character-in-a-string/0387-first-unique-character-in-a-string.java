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