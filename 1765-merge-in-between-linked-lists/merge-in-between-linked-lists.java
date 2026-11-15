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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       ListNode tem=list1;
        ListNode t=list1;
       ListNode te=list2;
       for(int i=0;i<a-1;i++){
        tem=tem.next;
       }
       for(int i=0;i<=b;i++){
        t=t.next;}
        while(te.next!=null){
            te=te.next;
        }
        tem.next=list2;
       te.next=t;
       return list1; 
    }
}