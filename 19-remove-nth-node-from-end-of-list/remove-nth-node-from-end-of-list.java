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
        ListNode tem=head;
        int size=0;
        while(tem!=null){
            size++;
            tem=tem.next;
        }
        tem=head;
        if(size<n){
            return head;
        }
        
        int new_n=size-n-1;
         if(n==size){
            
            return head.next;
         }
        
        for(int i=0;i<new_n;i++){
            tem=tem.next;
        }
        if(tem!=null && tem.next!=null){
        tem.next=tem.next.next;
        }
        return head;
    }
}