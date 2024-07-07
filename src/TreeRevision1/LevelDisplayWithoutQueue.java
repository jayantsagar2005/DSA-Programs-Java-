package TreeRevision1;

public class LevelDisplayWithoutQueue {
    public static int findLevel(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(findLevel(root.left),findLevel(root.right));
    }
    public static void levelWiseDisplay(Node root, int n, int level) {
        if(root == null) return;
        if(n == level) System.out.print(root.val+" ");
        levelWiseDisplay(root.left, n, level+1);
        levelWiseDisplay(root.right, n, level+1);
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

        int level = findLevel(a);

        for (int x=0; x<level; x++){
            levelWiseDisplay(a,x,0);
            System.out.println();
        }
    }
}
