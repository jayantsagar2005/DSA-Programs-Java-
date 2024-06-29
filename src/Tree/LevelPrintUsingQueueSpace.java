package Tree;


import java.util.LinkedList;
import java.util.Queue;

class Pair{
    Node node;
    int level;

    Pair(Node node, int level){
        this.level = level;
        this.node = node;
    }
}

public class LevelPrintUsingQueueSpace {

    public static void print(Node root) {
        Queue<Pair> q = new LinkedList<>();
        if (root != null) q.add(new Pair(root, 0));
        int preLevel = 0;
        while(!q.isEmpty()){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if (preLevel != level){
                System.out.println();
                preLevel++;
            }
            System.out.print(node.val+" ");
            if (node.left != null){
                q.add(new Pair(node.left, level+1));
            }
            if (node.right != null){
                q.add((new Pair(node.right, level+1)));
            }
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

        print(a);
        System.out.println();
    }
}
