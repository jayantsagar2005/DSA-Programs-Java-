package LinkedList;


public class removeKValue {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(1);
        Node e = new Node(1);
        Node f = new Node(1);
        Node g = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        displayList(a);
        Node ans = removeValue(a,1);
        if(ans == null){
            System.out.println("Null");
        }else{
           displayList(ans);
        }
    }

    public static Node removeValue(Node head, int n) {
        while (head.value == n){
            head = head.next;
        }
        System.out.println("hello");
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.value == n) {
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
