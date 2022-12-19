/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // calculate length of two arrays first
        int lenA = 0, lenB = 0;
        ListNode currentA = headA;
        ListNode currentB = headB;

        while(currentA != null){
            lenA++;
            currentA = currentA.next;
        }

        while(currentB != null){
            lenB++;
            currentB = currentB.next;
        }

        currentA = headA;
        currentB = headB;
        // now find the longest linkedlist
        if(lenA > lenB){
            // traverse lenA - lenB steps in List B
            for (int i = 0; i < lenA-lenB; i++) {
                currentA = currentA.next;
            }
        }else{
            // traverse lenB - lenA steps in List B
            for (int i = 0; i < lenB-lenA; i++) {
                currentB = currentB.next;
            }
        }

        // check for intersection
        while(currentA != null && currentB != null){
            if(currentA == currentB) return currentA;
            currentA = currentA.next;
            currentB = currentB.next;
        }

        return null;
    }
}
// @lc code=end

