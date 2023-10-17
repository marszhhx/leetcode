/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1), write1 = dummy1;
        ListNode dummy2 = new ListNode(-1), write2 = dummy2;
        ListNode read = head;

        while (read != null) {
            if (read.val < x) {
                write1.next = read;
                write1 = write1.next;
            } else {
                write2.next = read;
                write2 = write2.next;
            }
            ListNode nextRead = read.next;
            read.next = null;
            read = nextRead;
        }

        write1.next = dummy2.next;
        return dummy1.next;
    }
}
// @lc code=end

