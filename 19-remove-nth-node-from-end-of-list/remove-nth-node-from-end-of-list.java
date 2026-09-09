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
        int size=0;
        ListNode tem=head;
        while(tem!=null){
            tem=tem.next;
            size++;

        }
        tem=head;
        int target=size-n;
       
        if(target==0){
            return head=head.next;
        }
        
        for(int j=0;j<target-1;j++){
            tem=tem.next;

        }tem.next=tem.next.next;
        
         return head;
    }
}