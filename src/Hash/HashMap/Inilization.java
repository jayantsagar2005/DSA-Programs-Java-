package Hash.HashMap;

import java.util.HashMap;

public class Inilization {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,2);

        System.out.println(map.containsKey(5));

        System.out.println(map.get(1));

        System.out.println(map.size());

        map.remove(1);

        map.put(2,5);
        map.put(3,9);
        map.put(4,7);
        map.put(5,10);
        map.put(6,50);
        map.put(7,54);
        map.put(8,59);
        map.put(9,74);
        map.put(10,85);
        map.put(11,105);

        for (int key: map.keySet()) {
            System.out.println(key+" --> "+map.get(key));
        }

    }
}
