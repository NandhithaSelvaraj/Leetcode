/*
 * Problem: 206. Reverse Linked List
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/reverse-linked-list/submissions/2119324467/
 * Language: java
 * Date: 2026-08-25
 */

class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while(curr != null){
        ListNode nextTemp = curr.next;
        curr.next =  prev;
        prev = curr;
        curr = nextTemp;
       }
       return prev;
    }
}
