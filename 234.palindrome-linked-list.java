import java.util.List;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        // Find mid
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midNode = slow;
        // Reverse second half
        ListNode prev = null;
        ListNode current = midNode;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // Check two parts
        ListNode firsthalf = head;
        ListNode secondhalf = prev;
        while (firsthalf != null && secondhalf != null) {
            if(firsthalf.val != secondhalf.val) return false;
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
}
// @lc code=end

