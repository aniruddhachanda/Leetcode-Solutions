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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                arr.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(arr);
        if(arr.isEmpty()){
            return null;
        }
        ListNode head=new ListNode(arr.get(0));
        ListNode mover=head;
        for(int i=1;i<arr.size();i++){
            ListNode temp1=new ListNode(arr.get(i));
            mover.next=temp1;
            mover=temp1;
        }
        return head;
    }
}