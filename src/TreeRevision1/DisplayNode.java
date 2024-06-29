package TreeRevision1;

public class DisplayNode {

    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root) {
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int product(Node root) {
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static int nonZeroProduct(Node root) {
        if(root == null) return 1;
        if(root.val == 0) root.val = 1;
        return root.val * nonZeroProduct(root.left) * nonZeroProduct(root.right);
    }
    public static int maxNode(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxNode(root.left),maxNode(root.right)));
    }
    public static int minNode(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minNode(root.left),minNode(root.right)));
    }
    public static int sizeNode(Node root) {
        if (root == null) return 0;
        return 1 + sizeNode(root.left) + sizeNode(root.right);
    }
    public static int levelNode(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levelNode(root.left),levelNode(root.right));
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

        System.out.print("Display Node : ");
        display(a);
        System.out.println();

        System.out.print("Sum Node : ");
        int sum = sum(a);
        System.out.println(sum);

        System.out.print("Product Node : ");
        int pro = product(a);
        System.out.println(pro);

        System.out.print("Non-Zero Product : ");
        int nonPro = nonZeroProduct(a);
        System.out.println(nonPro);

        System.out.print("Minimum Node : ");
        int min = minNode(a);
        System.out.println(min);

        System.out.print("Maximum Node : ");
        int max = maxNode(a);
        System.out.println(max);

        System.out.print("Size Nodes : ");
        int size = sizeNode(a);
        System.out.println(size);

        System.out.print("Edge Nodes : ");
        System.out.println(size-1);

        System.out.print("Level Nodes : ");
        int level = levelNode(a);
        System.out.println(level);

        System.out.print("Height Nodes : ");
        System.out.println(level-1);
    }

}
