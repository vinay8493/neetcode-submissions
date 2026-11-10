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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cerry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while(l1 != null && l2 != null){
            int sum = cerry + l1.val + l2.val;
            cerry = 0;
            int nodeVal = sum % 10;
            cerry = sum / 10;
            dummy.next = new ListNode(nodeVal);
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = cerry + l1.val;
            cerry = 0;
            int nodeVal = sum % 10;
            cerry = sum / 10;
            dummy.next = new ListNode(nodeVal);
            dummy = dummy.next;
            l1 = l1.next;

        }

        while(l2 != null){
            int sum = cerry + l2.val;
            cerry = 0;
            int nodeVal = sum % 10;
            cerry = sum / 10;
            dummy.next = new ListNode(nodeVal);
            dummy = dummy.next;
            l2 = l2.next;

        }

        if(cerry != 0){
            dummy.next = new ListNode(cerry);
            dummy = dummy.next;
        }

        return ans.next;
           
    }
}
