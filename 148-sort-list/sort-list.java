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
        if(head==null||head.next==null){
            return head;
        }
        ListNode middle=findMiddle(head);
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;

        left=sortList(left);
        right=sortList(right);

        return mergeSortList(left,right);
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergeSortList(ListNode list1,ListNode list2){
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dNode=new ListNode(-1);
        ListNode temp=dNode;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        else{
            temp.next=temp2;
        }
        return dNode.next;
    }
}