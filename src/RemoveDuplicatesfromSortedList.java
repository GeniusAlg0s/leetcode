class RemoveDuplicatesfromSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp =head;
        ListNode current = head;

        while(current!=null){

            while (temp!=null && temp.val==current.val){
                temp = temp.next;
            }current.next =temp;
            current = current.next;
        }
        return head;
    }
}