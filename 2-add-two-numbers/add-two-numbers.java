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
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode tem=dummy;
        int count =0;
        while(h1!=null||h2!=null || count!=0){
            int x=0;
            if(h1!=null){
                x+=h1.val;
                h1=h1.next;
            }
             if(h2!=null){
                x+=h2.val;
                h2=h2.next;
            }
            if(count!=0){
                x+=count;
            }
            
            int p=x%10;
            count=x/10;
            
             tem.next=new ListNode(p);
            
            tem=tem.next;
        }return dummy.next;
    }
}