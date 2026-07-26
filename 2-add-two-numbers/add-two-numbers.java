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
        ListNode tem1=l1;
        ListNode tem2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode tem=dummy;
    int sum=0;
    int carry=0;
    int a,b;
    while(tem1!=null||tem2!=null){
        if(tem1!=null){
             a=tem1.val;
        }else{
             a=0;
        }
        if(tem2!=null){
             b=tem2.val;
        }else{
             b=0;
        }
       
        sum=a+b+carry;
          int digit=sum%10;
          carry=sum/10;
            tem.next=new ListNode(digit);
            tem=tem.next;
            
        if (tem1 != null) 
        tem1 = tem1.next;
      if (tem2 != null) 
      tem2 = tem2.next;
         if(carry>0){
            tem.next=new ListNode(carry);
            
         }

    }
    return dummy.next;
        
    }
}