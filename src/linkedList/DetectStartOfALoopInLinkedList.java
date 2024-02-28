package linkedList;


public class DetectStartOfALoopInLinkedList {

    public static ListNode head;

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "--->");
        }
        System.out.print("null");
    }

    public static ListNode startOfALoop(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return getStartingNode(slow);
            }
        }
        return null;
    }

    private static ListNode getStartingNode(ListNode slow) {
        ListNode temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }

    public ListNode removeLoop(){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return endLoop(slow);
            }
        }
        return null;
    }

    private ListNode endLoop(ListNode slow) {
        ListNode temp = head;
        while (slow.next != temp.next){
            slow=slow.next;
            temp=temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second  = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        System.out.println(startOfALoop(head).data);

//        display(head);

    }

}
