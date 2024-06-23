package Tree;

public class SizeOfNodes {
    public static int size(Node root) {
        if (root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(82);
        Node f = new Node(5);
        Node g = new Node(10);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.right = g;

        int ans = size(a);
        System.out.println("Maximum value is : " + ans);
    }
}
