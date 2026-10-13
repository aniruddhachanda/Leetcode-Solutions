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
       ArrayList<Integer>arr=convertArray(head);
       Collections.sort(arr);
       if(head==null){
        return null;
       }
       head=new ListNode(arr.get(0));
       ListNode mover=head;
       for(int i=1;i<arr.size();i++){
        ListNode temp=new ListNode(arr.get(i));
        mover.next=temp;
        mover=temp;
       }
       return head;

    }
    public ArrayList<Integer> convertArray(ListNode head){
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        return ans;
    }
}