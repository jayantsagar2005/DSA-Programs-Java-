package Tree;

public class ProductNodes {

    public static int product(Node root) {
        if (root == null){
            return 1;
        }
        return root.val * product(root.left) * product(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        int ans = product(a);
        System.out.println("Sum is : "+ans);
    }
}
