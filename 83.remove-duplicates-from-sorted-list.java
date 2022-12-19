/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode lastNode = head;
        ListNode current = head;

        while(current != null){
            if(current.val != lastNode.val){
                lastNode.next = current;
                lastNode = lastNode.next;
            }
            current = current.next;
        }

        if(lastNode != null) lastNode.next = null;

        return head;
    }
}
// @lc code=end

