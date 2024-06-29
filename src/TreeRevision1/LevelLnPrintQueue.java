package TreeRevision1;

import java.util.ArrayDeque;
import java.util.Queue;

class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

public class LevelLnPrintQueue {

    public static void display(Node root) {
        if(root == null) return;
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));
        int preLevel = 0;
        while(q.size() > 0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if (preLevel != level){
                System.out.println();
                preLevel = level;
            }

            System.out.print(node.val+" ");

            if (node.left != null) q.add(new Pair(node.left, level+1));
            if (node.right != null) q.add(new Pair(node.right, level+1));

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

        display(a);
    }
}
