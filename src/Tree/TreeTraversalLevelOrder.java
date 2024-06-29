package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeTraversalLevelOrder {

    public static void print(Node root, Queue<Node> q) {
        if (root == null){
            return;
        }
        q.add(root);
        while (!q.isEmpty()){
            System.out.print(root.val+" ");
            q.remove(root);
            if(root.left != null){
                q.add(root.left);
            }
            if(root.right != null){
                q.add(root.right);
            }
            root = q.peek();
        }
    }

    public static void rightToLeft(Node root, Queue<Node> q) {
        if (root == null){
            return;
        }
        q.add(root);
        while (!q.isEmpty()){
            System.out.print(root.val+" ");
            q.remove(root);
            if(root.right != null){
                q.add(root.right);
            }
            if(root.left != null){
                q.add(root.left);
            }
            root = q.peek();
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

        Queue<Node> que = new ArrayDeque<>();

        print(a, que);
        System.out.println();
        rightToLeft(a, que);
    }
}
