package Tree;

public class MinValue {
    public static int minValue(Node root) {
        if (root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(minValue(root.left),minValue(root.right)));
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(-82);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        int ans = minValue(a);
        System.out.println("Minimum value is : " + ans);
    }
}
