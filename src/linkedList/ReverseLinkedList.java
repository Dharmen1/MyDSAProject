package linkedList;

public class ReverseLinkedList {

    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode head) {

        while (head != null) {
            System.out.print(head.data + "--->");
            head = head.next;
        }
        System.out.print("null");
    }

    public  ListNode reverseLinkedList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ReverseLinkedList rLL = new ReverseLinkedList();
        rLL.head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(7);

        rLL.head.next = second;
        second.next = third;
        third.next = fourth;

        rLL.display(head);

        head = rLL.reverseLinkedList(head);
        rLL.display(head);

     //   System.out.println(rLL.reverseLinkedList(rLL.head));

      //  rLL.display();
    }
}
