package LinkedListQuestion;

public class consecutiveMerge {

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static Node mergeNode(Node head) {
        Node temp = head.next;
        Node ans = new Node(-1);
        Node t = ans;
        while(temp != null){
            int sum = 0;
            Node t1 = temp;
            while(t1.val != 0){
                sum = sum + t1.val;
                t1 = t1.next;
            }
            temp = t1.next;
            Node node = new Node(sum);
            t.next = node;
            t = t.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(0);
        Node d = new Node(3);
        Node e = new Node(0);
        Node f = new Node(2);
        Node g = new Node(2);
        Node h = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        Node ans = mergeNode(a);
        display(ans);
    }
}
