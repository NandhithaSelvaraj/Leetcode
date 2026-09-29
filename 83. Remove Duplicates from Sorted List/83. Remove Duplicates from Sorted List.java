/*
 * Problem: 83. Remove Duplicates from Sorted List
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/2156779597/
 * Language: java
 * Date: 2026-09-29
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
