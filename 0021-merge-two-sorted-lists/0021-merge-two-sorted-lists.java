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
        ListNode ans=new ListNode();
        return makeShift(ans,list1,list2);
    }
    private ListNode makeShift(ListNode ans,ListNode list1,ListNode list2){
        if(list1==null&&list2==null)return null;
        if(list1==null)return list2;
        if( list2==null)return list1;

        if(list1.val<list2.val){
            ans.val=list1.val;
            ans.next=makeShift(new ListNode(),list1.next,list2);
        }else{
            ans.val=list2.val;
            ans.next=makeShift(new ListNode(),list1,list2.next);
        }
        return ans;
    }
}