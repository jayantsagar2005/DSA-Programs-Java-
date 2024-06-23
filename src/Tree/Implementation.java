package Tree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class Implementation {
    private static int size = 0;

    public static void display(Node root) {
        if (root == null){
            return;
        }
        display(root.left);
        display(root.right);
        System.out.print(root.val+" ");
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

        display(a);
        System.out.println();
//
    }
}
