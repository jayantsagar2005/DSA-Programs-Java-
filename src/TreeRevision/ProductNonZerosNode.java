package TreeRevision;

public class ProductNonZerosNode {

    public static int result(Node root) {
        if (root == null){
            return 1;
        }
        if(root.val == 0){
            root.val = 1;
        }
        return root.val * result(root.left) * result(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(0);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(0);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        d.left = g; d.right = h;
        e.right = i;
        c.right = f;
        f.left = j;

        int product = result(a);
        System.out.println("Product is : "+product);
    }
}
