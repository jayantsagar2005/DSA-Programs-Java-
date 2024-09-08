package Hash.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VerticalOrder {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        List<List<Integer>> ans = verticalTraversal(a);

//        System.out.println(ans);
    }
    public static void helper(Node root, HashMap<Integer, Integer> map, int level){
        if(root == null) return;
        helper(root.left, map, level-1);
        map.put(root.data, level);
        helper(root.right, map, level+1);

    }
    public static List<List<Integer>> listToAns(List<Integer> val, List<Integer> level){
        List<List<Integer>> ans  = new ArrayList<>();
        for(int i=0; i<val.size();){
            int j = i;
            List<Integer> list = new ArrayList<>();
            while(j < val.size() && level.get(i) == level.get(j)){
                list.add(val.get(j));
                j++;
            }
            ans.add(list);
            i = j;
        }
        return ans;
    }
    public static List<List<Integer>> verticalTraversal(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(root, map, 0);
        System.out.println(map);
        List<Integer> val = new ArrayList<>(map.keySet());
        List<Integer> level = new ArrayList<>(map.values());
        return listToAns(val, level);

    }
}
