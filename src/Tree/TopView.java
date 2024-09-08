package Tree;

import java.util.ArrayList;

public class TopView {

    public static int[] topView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = root;

        while(temp != null){
            list.add(temp.val);
            temp = temp.left;
        }

        temp = root.right;

        while(temp != null){
            list.add(temp.val);
            temp = temp.right;
        }

        int[] ans = new int[list.size()];

        for(int i=0; i<ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;

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

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        d.left = g;
        f.left = h;

        int[] ans = topView(a);

        for (int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }


    }
}


