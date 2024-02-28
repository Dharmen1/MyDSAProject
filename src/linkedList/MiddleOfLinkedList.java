package linkedList;

public class MiddleOfLinkedList {

    private ListNode head;

    public static class ListNode {
        int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static ListNode middleOfLinkedList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static int findLastNode(ListNode head) {
        ListNode current = head;
        int lastNode = 0;
        while (current != null) {
            lastNode = current.data;
            current = current.next;
        }
        return lastNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(6);
        ListNode fifth = new ListNode(8);
        ListNode sixth = new ListNode(7);


        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        display(head);

        ListNode middle = middleOfLinkedList(head);

        System.out.println("New Line");

        System.out.println(middle.data);

        System.out.println("New Line");

        display(middle);

        System.out.println("----new Line----");

        System.out.println(findLastNode(head));






    }
}
