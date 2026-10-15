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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dNode=new ListNode(-1);
        ListNode temp=head;
        ListNode prev=dNode;
        dNode.next=head;
        while(temp!=null){
            if(temp.next!=null&&temp.val==temp.next.val){
                while(temp.next!=null&&temp.val==temp.next.val){
                    temp=temp.next;
                }
                prev.next=temp.next;
            }
            else{
                prev=temp;
            }
            temp=temp.next;
        }
        return dNode.next;
    }
}