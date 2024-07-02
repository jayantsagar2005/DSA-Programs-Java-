package TreeRevision1;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrintLnQueue {
    public static void printLevel(Node root) {
        if (root == null) return;
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));
        int preLevel = 0;

        while(!q.isEmpty()){

            Pair front = q.remove();
            Node temp = front.node;
            int level = front.level;

            if (level != preLevel){
                preLevel = level;
                System.out.println();
            }

            System.out.print(temp.val+" ");



            if (temp.left != null)  q.add(new Pair(temp.left, level+1));

            if (temp.right != null) q.add(new Pair(temp.right, level+1));

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

        printLevel(a);
    }
}
