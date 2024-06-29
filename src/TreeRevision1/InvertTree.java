package TreeRevision1;

public class InvertTree {

    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void invertTree(Node root) {
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
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
        Node k = new Node(11);
        Node l = new Node(12);
        Node m = new Node(13);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = h;
        e.right = i;
        f.right = j;
        g.left = k; g.right = l;
        l.right  = m;

        invertTree(a);
        System.out.print("Invert Tree : ");
        display(a);
        System.out.println();

    }
}
