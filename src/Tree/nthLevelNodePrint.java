package Tree;

public class nthLevelNodePrint {

    public static void print(Node root, int k, int level) {
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.val+" ");
        }
        level++;
        print(root.left, k, level);
        print(root.right, k, level);
    }

    public static void rightToLeft(Node root, int k, int level) {
        if(root == null){
            return;
        }

        level++;
        print(root.left, k, level);
        print(root.right, k, level);
        if(level == k){
            System.out.print(root.val+" ");
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        print(a, 2, 0);
        System.out.println();
        rightToLeft(a, 2, 0);

    }
}
