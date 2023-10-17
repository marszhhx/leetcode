/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start

import java.util.PriorityQueue;
import java.util.Collection;

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        
        // to store the final result
        ListNode dummy = new ListNode(-1);

        // pointer
        ListNode p = dummy;

        // Using a priorityQueue minHeap to store the 
        // first unvisited node of a list
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b)->(a.val - b.val));
        
        // traverse and add first node to pq
        // does this handle empty list?
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            } 
        } 

        // pop the min value node;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            // keep moving the pointer 
            p = p.next;
        }

        return dummy.next;
    }
}
// @lc code=end

