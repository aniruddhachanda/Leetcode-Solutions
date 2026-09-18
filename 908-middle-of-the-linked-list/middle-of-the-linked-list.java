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
    public ListNode middleNode(ListNode head) {
        int middleNode=(size(head)/2)+1;
        ListNode temp=head;
        while(temp!=null){
            middleNode=middleNode-1;
            if(middleNode==0){
                break;
            }
            temp=temp.next;
        }
        return temp;
    }
    private int size(ListNode head){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}