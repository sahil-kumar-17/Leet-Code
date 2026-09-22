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
        ListNode l3=new ListNode();
        return helper(l1,l2,l3,0);
    }
    private ListNode helper(ListNode l1 ,ListNode l2,ListNode l3,int carry){
        if(l1==null&&l2==null){
            if(carry!=0){
                l3.val=carry;
                return l3;
            }
            return null;
        }
        l3.next=new ListNode();
        if(l1!=null&&l2!=null){
            l3.val=(l1.val+l2.val+carry)%10;
            carry=(l1.val+l2.val+carry)/10;
            l3.next=helper(l1.next,l2.next,l3.next,carry);
        }else if(l1!=null){
            l3.val=(l1.val+carry)%10;
            carry=(l1.val+carry)/10;
            l3.next=helper(l1.next,l2,l3.next,carry);
        }else{
            l3.val=(l2.val+carry)%10;
            carry=(l2.val+carry)/10;
            l3.next=helper(l1,l2.next,l3.next,carry);
        }
        
        return l3;
    }
}