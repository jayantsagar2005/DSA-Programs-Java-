package LinkedList;

public class removeKElement {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        display(a);
        findValue(0,a);

    }

    public static void findValue(int k, Node head) {
        Node fast = head;
        Node slow = head;

        for(int i=0; i<k; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        assert slow != null;
        System.out.println(slow.value);

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
