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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        if (k % length == 0) {
            return head;
        } else {
            k%=length;
        }
        tail.next=head;
        ListNode last=lastfinder(head,length-k);
        head=last.next;
        last.next=null;
        return head;
    }
    private ListNode lastfinder(ListNode head,int p){
        ListNode temp=head;
        for(int i=1;i<p;i++){
            temp=temp.next;
        }
        return temp;
    }
}