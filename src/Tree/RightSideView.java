package Tree;
public class RightSideView {

    public static int level(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public static void display(Node root, int level, int[] arr) {
        if(root == null) return;
        arr[level] = root.val;
        if (root.left != null) display(root.left, level+1, arr);
        if (root.right != null) display(root.right, level+1, arr);

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

        int level = level(a);

        int[] arr = new int[level];
        display(a, 0, arr);

        for (int ele :arr ) {
            System.out.print(ele+" ");
        }
    }
}
