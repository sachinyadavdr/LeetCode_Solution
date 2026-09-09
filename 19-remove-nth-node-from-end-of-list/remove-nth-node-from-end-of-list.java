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
        size++;
        tem=tem.next;}
        if(n==size){
        return head.next;}
        tem=head;
        int m=size-n-1;
        for(int i=0;i<m;i++){
            tem=tem.next;
        }
        tem.next=tem.next.next;
        return head;
    }
}