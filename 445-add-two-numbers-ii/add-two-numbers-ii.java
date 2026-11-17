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
        Stack<Integer>stack=new Stack<>();
        Stack<Integer>s=new Stack<>();
        ListNode tem=l1;
        ListNode tem1=l2;
        ListNode head = null;

        while(tem!=null){
            stack.push(tem.val);
            tem=tem.next;
        }
        while(tem1!=null){
            s.push(tem1.val);
            tem1=tem1.next;
        }
        int count =0;
        while(!stack.isEmpty()||!s.isEmpty()||count!=0){
            int sum = count;

        if(!stack.isEmpty()) {
         sum += stack.pop();
    }
        if(!s.isEmpty()) {
         sum += s.pop();}
         count = sum / 10;

            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
        
        }
           
        return head;

    }
}