package Tree;

public class ConstructTree {

    public static Node helper(int[] pre, int[] in, int a, int b, int c, int d) {
        if(a > b || c > d) return null;
        Node root = new Node(pre[a]);
        int r = 0;
        while(in[r] != pre[a]) r++;
        int l = r - c;

        root.left = helper(pre, in, a+1, a+l, c, r-1);
        root.right = helper(pre, in, a+l+1, b, r+1, d);

        return root;
    }

    public static Node treeConstruct1(int[] preOrder, int[] inOrder) {
       int a = 0;
       int b = preOrder.length-1;
       int c = 0;
       int d = inOrder.length-1;
       return helper(preOrder, inOrder, a, b, c, d);

    }
    public static int levels(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    public static void print(Node root, int n, int level) {
        if(root == null) return;
        if(level == n){
            System.out.print(root.val+" ");
        }
        print(root.left, n, level+1);
        print(root.right, n, level+1);
    }
    public static void main(String[] args) {
        int[] pre =  {8,3,1,6,4,7,10,14,13};
        int[] in =   {1,3,4,6,7,8,10,13,14};
        int[] post = {1,4,7,6,3,13,14,10,8};

//        Node root = treeConstruct1(pre, in);
        Node root1 = treeConstruct2(in, post);

        int level = levels(root1);

        for(int i=0; i<level; i++){
            print(root1, i, 0);
            System.out.println();
        }
    }

    public static Node treeConstruct2(int[] inOrder, int[] postOrder) {
        int a = 0;
        int b = inOrder.length-1;
        int c = 0;
        int d = postOrder.length-1;
        return helper2(inOrder, postOrder, a, b, c, d);
    }

    public static Node helper2(int[] in, int[] post, int a, int b, int c, int d) {
        if(a > b || c > d) return null;
        Node root = new Node(post[d]);

        int r = 0;
        while(in[r] != post[d]) r++;
        int l = r-d+8;

        root.left = helper2(in, post, a, a+l-1, c, r-1);
        root.right = helper2(in, post, a+l+1, b, r, d-1);

        return root;
    }
}
