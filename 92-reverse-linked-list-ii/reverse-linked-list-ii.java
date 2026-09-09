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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode t=head;
        int size=0;
        while(t!=null){
            size++;
            t=t.next;
        }
        t=head;
        ListNode q= new ListNode(-1);
        
        
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=t.val;
            t=t.next;
       
        }
        int l=left-1;
        int r=right-1;
        while(l<=r){
            int p=arr[l];
            arr[l]=arr[r];
            arr[r]=p;
            l++;
            r--;
        }
        ListNode dummy=new ListNode(-1);
        ListNode tem=dummy;
        for(int i=0;i<size;i++){
            tem.next=new ListNode (arr[i]);
            tem=tem.next;
        }
        
       return dummy.next;

    }
}