package LinkedListQuestion;

public class findCycleListLength {

    public static int findLength(Node head) {
        Node slow = head.next;
        Node fast = head.next.next;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        int size = 1;
        fast = fast.next;
        while(fast != slow){
            fast = fast.next;
            size++;
        }
        return size;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = i;
        int ans = findLength(a);
        System.out.println("Length : "+ans);
    }
}
