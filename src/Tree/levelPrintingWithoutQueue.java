package Tree;

public class levelPrintingWithoutQueue {

    public static int level(Node root) {
        if (root == null){
            return 0;
        }

        return 1 + Math.max(level(root.left),level(root.right));
    }
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

        int level = level(a);
        System.out.println(level);

        for(int i=0; i<level; i++){
            print(a, i, 0);
        }
    }
}
