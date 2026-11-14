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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tem = head;
        int size = 0;
        while (tem != null) {
            size++;
            tem = tem.next;
        }
        tem = head;
        int t = size - n - 1;
        if(t<0){
            return head.next;
        }
        while (t > 0 && tem != null) {
            tem = tem.next;
            t--;
        }
        if (tem.next == null)
            return head;
        tem.next = tem.next.next;
        return head;
    }
}