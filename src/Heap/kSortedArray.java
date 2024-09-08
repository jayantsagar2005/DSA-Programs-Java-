package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

class Node implements Comparable<Node>{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }


    @Override
    public int compareTo(Node o) {
        return this.val - o.val;
    }
}

public class kSortedArray {
    public static void main(String[] args) {
//        lists = [[1,4,5],[1,3,4],[2,6]]
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(5);
        a.next = b; b.next = c;

        Node d = new Node(1);
        Node e = new Node(3);
        Node f = new Node(4);
        d.next = e; e.next = f;

        Node g = new Node(2);
        Node h = new Node(6);
        g.next = h;

        Node[] list = new Node[3];
        list[0] = a;
        list[1] = d;
        list[2] = g;

        Node ans = mergeKLists(list);

        while(ans != null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }

    }

    public static Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> min = new PriorityQueue<>();

        min.addAll(Arrays.asList(lists));

        Node ans = new Node(-1);
        Node temp  = ans;

        while(!min.isEmpty()){
            Node node = min.remove();
            Node t = node.next;
            node.next = null;
            temp.next = node;
            temp = temp.next;
            if(t != null){
                min.add(t);
            }
        }



        return ans.next;


    }
}
