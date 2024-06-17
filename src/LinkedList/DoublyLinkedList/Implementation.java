package LinkedList.DoublyLinkedList;
class Node{
    int val;
    Node next;
    Node pre;

    public Node(int val){
        this.val = val;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);
        a.pre = null;
        a.next = b;

        b.pre = a;
        b.next = c;

        c.pre = b;
        c.next = d;

        d.pre = c;
        d.next = e;

        e.pre = d;
        e.next = f;

        f.pre = e;
        f.next = g;

        g.pre = f;
        g.next = h;

        h.pre = g;
        h.next = null;

        print(a);
        reverse(h);
    }

    public static void reverse(Node tail) {
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.pre;
        }
        System.out.println();
    }

    public static void print(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
