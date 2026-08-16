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
        ListNode tem = head;
        int size=0;
        while(tem!=null){
            size++;
            tem=tem.next;
        }
        tem=head;
        int[] arr = new int[size];
        int i = 0;
        while (tem != null) {
            arr[i] = tem.val;
            tem = tem.next;
            i++;
        }
        Arrays.sort(arr);
        int n = arr.length;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        for (int j = 0; j < n; j++) {
            t.next = new ListNode(arr[j]);
            t=t.next;

        }

        return dummy.next;
    }
}