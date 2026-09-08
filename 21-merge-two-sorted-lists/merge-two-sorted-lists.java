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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode tem=dummy;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null&&t2!=null){
            if(t1.val>=t2.val){
                tem.next=t2;
                t2=t2.next;
                tem=tem.next;
            }else{
                tem.next=t1;
                t1=t1.next;
                tem=tem.next;
            }
        }
        while(t1!=null){
            tem.next=t1;
            t1=t1.next;
            tem=tem.next;
        }
        while(t2!=null){
            tem.next=t2;
            t2=t2.next;
            tem=tem.next;
        }return dummy.next;
    }
}