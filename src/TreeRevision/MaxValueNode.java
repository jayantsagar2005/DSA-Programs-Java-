package TreeRevision;

public class MaxValueNode {

    public static int maxValue(Node root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
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

        int ans = maxValue(a);
        System.out.println("Maximum value is : "+ans);
    }
}
