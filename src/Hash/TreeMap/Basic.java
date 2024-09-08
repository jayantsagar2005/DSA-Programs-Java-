package Hash.TreeMap;

import java.util.TreeMap;

public class Basic {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        map.put('c', 10);
        map.put('a', 5);
        map.put('d', 2);
        map.put('y', 7);
        map.put('g', 101);
        map.put('i', 100);

        for (char key: map.keySet()) {
            System.out.println(key+" --> "+map.get(key));
        }
    }
}
