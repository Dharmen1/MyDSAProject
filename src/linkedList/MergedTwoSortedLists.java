package linkedList;

public class MergedTwoSortedLists {

    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
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

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }

    public static ListNode mergeSortedLists(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b != null){
            if (a.data <= b.data){
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null){
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergedTwoSortedLists msl1 = new MergedTwoSortedLists();
        msl1.insertLast(1);
        msl1.insertLast(5);
        msl1.insertLast(8);

        msl1.display();

        MergedTwoSortedLists msl2 = new MergedTwoSortedLists();
        msl2.insertLast(3);
        msl2.insertLast(4);
        msl2.insertLast(7);
        msl2.insertLast(9);
        msl2.display();

        MergedTwoSortedLists merge = new MergedTwoSortedLists();
        merge.head = mergeSortedLists(msl1.head, msl2.head);
        merge.display();


    }
}
