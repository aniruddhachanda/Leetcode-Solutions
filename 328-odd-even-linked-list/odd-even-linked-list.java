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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            if(temp.next!=null){
                temp=temp.next.next;
            }
            else{
                break;
            }
        }
        temp=head.next;
        while(temp!=null){
            arr.add(temp.val);
           if(temp.next!=null){
            temp=temp.next.next;
           }
           else{
            break;
           }
        }
        int i=0;
        temp=head;
        while(temp!=null){
            temp.val=arr.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
    private int size(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}