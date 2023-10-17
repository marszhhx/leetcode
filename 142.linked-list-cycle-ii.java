/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        // detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                break;
        }

        // if there is no cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // there is cycle
        slow = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        // they will meet at the entrance
        return slow;
        
    }
}
// @lc code=end

