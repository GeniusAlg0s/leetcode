
public class addLinkedListNumbers {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this(val);
            this.next = next;
        }

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headHolder = new ListNode(0);
        ListNode p = l1;
        ListNode q =l2;
        ListNode current = headHolder;
        int carryOver = 0;

        while (p !=null || q!=null){
            int x = (p !=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int sum = x+y+carryOver;
            carryOver = sum/10;
            current.next = new ListNode (sum%10);
            current = current.next;

            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
        }
        if( carryOver >0) current.next = new ListNode(carryOver);

        return headHolder.next;
    }
    public static void main(String[]args){

    }
}

