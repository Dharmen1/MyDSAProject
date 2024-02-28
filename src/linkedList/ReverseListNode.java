package linkedList;

public class ReverseListNode {

    private ListNode1 head;

    private static class ListNode1 {
        private int data;
        private ListNode1 next;

        public ListNode1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void display(ListNode1 head){
        ListNode1 current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ReverseListNode listNode = new ReverseListNode();
        listNode.head = new ListNode1(2);
        ListNode1 second = new ListNode1(3);
        ListNode1 third = new ListNode1(4);
        ListNode1 fourth = new ListNode1(5);
        ListNode1 fifth = new ListNode1(6);

        listNode.display(listNode.head);
    }
}
