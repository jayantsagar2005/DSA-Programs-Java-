package LinkedListQuestion;

public class removeValue {

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static Node removeValueNode(Node head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        if(head == null){
            System.out.println("Null");
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(7);
        Node c = new Node(7);
        Node d = new Node(7);
        Node e = new Node(4);
        Node f = new Node(5);
        Node g = new Node(6);
        Node h = new Node(0);
        Node i = new Node(9);
        Node j = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        Node ans = removeValueNode(a,7);
        display(ans);
    }
}
