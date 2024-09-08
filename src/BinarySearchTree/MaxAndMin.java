package BinarySearchTree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }
}

public class MaxAndMin {

    public static int maxValue(TreeNode root) {
        if(root.right != null){
            return maxValue(root.right);
        }else{
            return root.val;
        }
    }
    public static int minValue(TreeNode root) {
        if(root.left != null){
            return minValue(root.left);
        }else{
            return root.val;
        }
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(12);
        TreeNode g = new TreeNode(19);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        int min = minValue(a);
        System.out.println("Minimum : "+min);
        int max = maxValue(a);
        System.out.println("Maximum : "+max);
    }
}
