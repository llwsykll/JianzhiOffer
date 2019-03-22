/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode right = head;
        ListNode left = head;
        int i = 0;
        while(i<k && right!=null){
            right = right.next;
            i++;
        }
        if(i<k){
            return null;
        }
        while(right!=null){
            right = right.next;
            left = left.next;
        }
        return left;
    }
}