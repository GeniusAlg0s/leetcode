class MergeTwoSortedList {
    public class ListNode {
        int val;
        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int data) {
//            this.data = data;
//        }

        ListNode(int data, ListNode next) {
            this.val = data;
            this.next = next;
        }
    }

    public  ListNode newNode(int key){
        ListNode temp = new ListNode(key, null);
        temp.val = key;
        temp.next = null;
        return temp;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2== null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

    }
    public static void main(String[]args){
        int [] l1 = {1,2,4};
        int [] l2 = {1,3,4};




    }
}