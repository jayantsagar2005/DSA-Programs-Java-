package Hash.HashMap;

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Pair{
    Node node;
    int idx;
    Pair(Node node, int idx){
        this.node = node;
        this.idx = idx;
    }
}

class TopView {

    public static void topView(Node root) {
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();



        q.add(new Pair(root, 0));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            Pair top = q.remove();
            Node node = top.node;
            int idx = top.idx;

            min = Math.min(min, idx);
            max = Math.max(max, idx);

            if(!map.containsKey(idx)){
                map.put(idx, node.data);
            }

            if(node.left != null){
                q.add(new Pair(node.left, idx-1));
                min--;
            }
            if(node.right != null){
                q.add(new Pair(node.right, idx+1));
                max++;
            }
        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i));
        }



    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}
