package TreeRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public static void print(Node root, List<Integer> ans) {
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()){
            Node node = st.pop();
            ans.add(node.val);
            if(node.left != null) st.push(node.left);
            if(node.right != null) st.push(node.right);
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

        List<Integer> ans = new ArrayList<>();
        print(a, ans);
        Collections.reverse(ans);

        System.out.println(ans);
    }
}
