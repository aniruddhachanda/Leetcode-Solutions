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
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null){
            ans.add(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            ans.add(temp2.val);
            temp2=temp2.next;
        }
        Collections.sort(ans);
        if(ans.isEmpty()){
            return null;
        }
        ListNode head=convertLL(ans);
        return head;
    }
    private ListNode convertLL(ArrayList<Integer>arr){
        ListNode head=new ListNode(arr.get(0));
        ListNode mover=head;
        for(int i=1;i<arr.size();i++){
            ListNode temp=new ListNode(arr.get(i));
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
}