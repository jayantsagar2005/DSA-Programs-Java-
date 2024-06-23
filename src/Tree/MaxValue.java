package Tree;

public class MaxValue {

    public static int maxValue(Node root) {
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(82);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        int ans = maxValue(a);
        System.out.println("Maximum value is : " + ans);
    }
}
