package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        Node ans = reverseList(a);
        Node ans = reverseRec(a);
        display(ans);

    }

    public static Node reverseRec(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head.next;
        Node newHead = reverseRec(temp);
        temp.next = head;
        head.next = null;

        return newHead;
    }

    public static Node reverseList(Node head) {
        Node p = null;
        Node c = head;
        Node n = head.next;
        while(n != null){
            c.next = p;
            p = c;
            c = n;
            n = n.next;
        }
        c.next = p;
        return c;
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
