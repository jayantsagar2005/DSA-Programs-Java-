package LinkedListQuestion;

class Node1 {
    int val;
    Node1 next;
    Node1 pre;
    Node1 child;

    Node1(int val){
        this.val = val;
    }
}

public class FlattenAMultilevel {

    public static void display(Node1 head) {
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node1 a = new Node1(1);
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);
        Node1 f = new Node1(6);

        a.next = b; b.pre = a;
        b.next = c; c.pre = b;
        c.next = d; d.pre = c;
        d.next = e; e.pre = d;
        e.next = f; f.pre = e;

        Node1 g = new Node1(7);
        Node1 h = new Node1(8);
        Node1 i = new Node1(9);
        Node1 j = new Node1(10);

        c.child = g;
        g.next = h; h.pre = g;
        h.next = i; i.pre = h;
        i.next = j; j.pre = i;

        Node1 k = new Node1(11);
        Node1 l = new Node1(12);

        h.child = k;
        k.next = l;
        l.pre = k;

        Node1 ans = flattenSolve(a);
        display(ans);
    }

    public static Node1 flattenSolve(Node1 head) {
        Node1 temp = head;
        Node1 n = null;
        while(temp != null){
            if(temp.child != null){
                n = temp.next;
                Node1 t = temp.child;
                Node1 ans = flattenSolve(t);
                temp.next = ans;
                ans.pre = temp;
                Node1 a = ans;
                while(a.next != null){
                    a = a.next;
                }
                a.next = n;
                if (n != null){
                    n.pre = a;
                }
                temp.child = null;
            }
            temp = temp.next;
        }

        return head;

    }
}
