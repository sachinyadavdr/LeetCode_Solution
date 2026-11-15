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
    public int getDecimalValue(ListNode head) {
        ListNode tem=head;
StringBuilder x = new StringBuilder();
        while(tem!=null){
            x.append(tem.val);
            tem=tem.next;
        }
        int y=Integer.parseInt(x.toString(),2);
        return y;
    }
}