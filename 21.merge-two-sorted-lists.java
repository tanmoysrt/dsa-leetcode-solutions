/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode result = null;
        if(list1.val < list2.val){
            result = list1;
            list1 = list1.next;
        }else{
            result = list2;
            list2 = list2.next;
        }
        
        ListNode current = result;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }else{
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }

        if(list1 != null) current.next = list1;
        if(list2 != null) current.next = list2;

        return result;
    }
}
// @lc code=end

