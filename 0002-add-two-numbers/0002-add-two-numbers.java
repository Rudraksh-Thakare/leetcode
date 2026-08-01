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
        int carry=0;
        ListNode result=new ListNode();
        ListNode p=result;
        while(l1!=null || l2!=null || carry!=0)   
        {
            int x=0;
            int y=0;
            if(l1!=null)
            {
                x=l1.val;
            }
            if(l2!=null)
            {
                y=l2.val;
            }
            int sum=x+y+carry;
            if(sum>=10)
            {
                int temp=sum%10;
                p.next=new ListNode(temp);
                carry=sum/10;
            }
            else
            {
                p.next=new ListNode(sum);
                carry=0;
            }
            if(l1!=null)
            {
                l1=l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
            p=p.next;
        }
        return result.next;
    }
}