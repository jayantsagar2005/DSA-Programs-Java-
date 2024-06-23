package TreeRevision;

public class preInPost {

    public static void pre(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        pre(root.left);
        pre(root.right);
    }
    public static void in(Node root) {
        if(root == null){
            return;
        }
        in(root.left);
        System.out.print(root.val+" ");
        in(root.right);
    }
    public static void post(Node root) {
        if(root == null){
            return;
        }
        post(root.left);
        post(root.right);
        System.out.print(root.val+" ");
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

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        d.left = g; d.right = h;
        e.right = i;
        c.right = f;
        f.left = j;

        System.out.print("Pre-Order : ");
        pre(a);
        System.out.println();
        System.out.print("In-Order : ");
        in(a);
        System.out.println();
        System.out.print("Post-Order : ");
        post(a);
        System.out.println();
    }
}
