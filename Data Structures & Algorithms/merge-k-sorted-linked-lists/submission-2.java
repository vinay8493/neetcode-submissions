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
        if(lists == null || lists.length == 0)
        return null;

        return divide(0, lists.length - 1, lists);
    }

    public ListNode divide(int l, int r, ListNode[] lists){
        if(l > r)
        return null;

        if(l==r)
        return lists[l];

        int mid = l - (l-r)/2;

        ListNode left = divide(l, mid, lists);
        ListNode right = divide(mid+1, r, lists);

        return conquer(left, right);

    }

    public ListNode conquer(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            }else{
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if(l1 != null){
            dummy.next = l1;
        }

        if(l2 != null){
            dummy.next = l2;
        }

        return ans.next;
    }
}
