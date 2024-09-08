package Hash.TreeSet;

import java.util.TreeSet;

public class Basic {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(100);
        set.add(80);
        set.add(20);
        set.add(90);
        set.add(110);
        set.add(105);
        set.add(222);
        set.add(852);
        set.add(4102);

        for (int val : set){
            System.out.println(val);
        }
    }
}
