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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=size(head);
        ListNode temp=head;
        if(cnt==n){
            head=head.next;
            return head;
        }
        int res=cnt-n;
        temp=head;
        while(temp!=null){
            res--;
            if(res==0){
                break;
            }
            else{
                temp=temp.next;
            }
        }
        ListNode deleteNode=temp.next;
        temp.next=temp.next.next;
        return head;
    }
    private int size(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}