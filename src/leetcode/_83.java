package Algorithm.leetcode;

/*

    Given a sorted linked list, delete all duplicates such that each
            element appear only once.

            For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return
            1->2->3.
*/

public class _83 {

    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode tmp = head;
            while (tmp != null) {
                while (tmp.next != null && tmp.next.val == tmp.val) {//tmp.next!=null要加上，因为while中的next会变！
                    tmp.next = tmp.next.next;
                }
                tmp = tmp.next;
            }

            return head;
        }
    }
}
