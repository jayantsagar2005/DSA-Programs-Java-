package TreeRevision1;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderDisplay {

    public static void levelOrderDisplay(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null) return;
        q.add(root);

        while(!q.isEmpty()){
            Node node = q.remove();
            System.out.print(node.val+" ");
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }

    }

    public static void levelOrderDisplayRightToLeft(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null) return;
        q.add(root);

        while(!q.isEmpty()){
            Node node = q.remove();
            System.out.print(node.val+" ");
            if(node.right != null) q.add(node.right);
            if(node.left != null) q.add(node.left);
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
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);
        Node m = new Node(13);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = h;
        e.right = i;
        f.right = j;
        g.left = k; g.right = l;
        l.right  = m;

        levelOrderDisplay(a);
        System.out.println();
        levelOrderDisplayRightToLeft(a);

    }
}
