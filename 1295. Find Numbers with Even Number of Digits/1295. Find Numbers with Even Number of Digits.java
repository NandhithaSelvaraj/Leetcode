/*
 * Problem: 1295. Find Numbers with Even Number of Digits
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/2118597446/?envType=problem-list-v2&envId=array
 * Language: java
 * Date: 2026-08-24
 */

class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;
       for(int num:nums){
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        if (digits % 2 == 0) {
            count++;
        }
       }
       return count; 
    }
}
