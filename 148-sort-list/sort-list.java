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
    public ListNode sortList(ListNode head) {
        ListNode t=head;
        int size=0;
        while(t!=null){
            size++;
            t=t.next;
        }
        t=head;
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=t.val;
            t=t.next;
        }
        Arrays.sort(arr);
         
        ListNode dummy=new ListNode(-1);
        ListNode tem=dummy;
        int i=0;
        while(i<size){
            tem.next=new ListNode(arr[i]);
            tem=tem.next;
            i++;
        }
        return   dummy.next;
    } 
}