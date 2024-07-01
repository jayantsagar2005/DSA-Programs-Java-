package TreeRevision1;

public class LevelPrintNthRow {
    public static void nthLevelRowDisplay(Node root, int level, int n) {
        if (root == null) return;

        if(level == n){
            System.out.print(root.val+" ");
        }
        nthLevelRowDisplay(root.left, level+1, n);
        nthLevelRowDisplay(root.right, level+1, n);

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

        nthLevelRowDisplay(a,0,4);
    }
}
