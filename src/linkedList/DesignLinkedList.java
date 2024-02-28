package linkedList;

public class DesignLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean display(ListNode head) {
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
        return false;
    }

    public int length() {
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value){
        // 1 -> 4 -> 5
        // 1 -> 4 -> 6 -> 5
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        }
    }

    public ListNode reverseSinglyLinkedList(ListNode head){
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            next = current;
        }
        return  previous;
    }

    public static void main(String[] args) {
        DesignLinkedList linkedList = new DesignLinkedList();
        linkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(50);
        ListNode fourth = new ListNode(41);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
   //     linkedList.insertLast(11);
    //    linkedList.insertLast(14);

    //    System.out.print("Length is" + ":" + linkedList.length());

        /*linkedList.insert(1, 3);
        linkedList.insert(2, 4);
        linkedList.insert(3, 6);
     //   linkedList.insert(2, 7);
        linkedList.delete(2);*/

        linkedList.display(linkedList.head);

        ListNode reverse = linkedList.reverseSinglyLinkedList(linkedList.head);
        System.out.println(linkedList.display(linkedList.head));
    }

}
