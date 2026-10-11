/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        int n1=0;
        ListNode temp2=headB;
        int n2=0;
        while(temp1!=null){
            n1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            n2++;
            temp2=temp2.next;
        }
        if(n1<n2){
            return collisionPoint(headA,headB,n2-n1,true);
        }
        return collisionPoint(headA,headB,n1-n2,false);
    }
    private ListNode collisionPoint(ListNode t1,ListNode t2,int d,boolean secondLong){
        while(d>0){
            if(secondLong){
                t2=t2.next;
            }
            else{
                t1=t1.next;
            }
            d--;
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}