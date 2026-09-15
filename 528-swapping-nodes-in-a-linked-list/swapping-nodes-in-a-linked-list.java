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
      int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=tem1.val;
            tem1=tem1.next;
        }
       
        int l=0;
        int r=arr.length-1;
        int p=arr.length-k;
        while(l<k-1&& r>=p){
            l++;
            r--;

        }
        int t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        for(int i=0;i<size;i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
  return dummy.next;
    }
}