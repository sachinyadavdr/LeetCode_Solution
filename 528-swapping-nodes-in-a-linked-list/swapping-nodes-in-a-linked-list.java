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
    public ListNode swapNodes(ListNode head, int k) {
     ListNode tem1=head; 
     int size=0;
     while(tem1!=null){
        size++;
        tem1=tem1.next;
     }
     tem1=head;
       int endk=size-k+1;
       for(int i=0;i<k-1;i++){
        tem1=tem1.next;
       } 
       ListNode t=head;
       for(int i=0;i<size-k;i++){
        t=t.next;
       } 
       int p=tem1.val;
       tem1.val=t.val;
       t.val=p;
       return head;
    }
}