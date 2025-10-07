package Home_Assignment_9;

public class Remove_Duplicates_from_sorted_list {
    public static void main(String[] args) {
        
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp= head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}
