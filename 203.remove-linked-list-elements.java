/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head = head.next;
        }
        if(head == null || (head.next==null && head.val==val)) return null;

        ListNode current = head;
        ListNode next = current.next;

        while (next  != null) {
            if(next.val == val){
                current.next = next.next;
                next = current.next;
                continue;
            }

            current = current.next;
            next = next.next;
        }

        return head;
    }
}
// @lc code=end

