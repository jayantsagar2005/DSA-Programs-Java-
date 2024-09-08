package Hash.HashMap;

import java.util.Collection;
import java.util.HashMap;

public class mapToString {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,0);
        map.put(3,7);
        map.put(4,5);
        map.put(5,8);
        map.put(6,6);
        map.put(7,4);
        map.put(8,1);
        map.put(9,0);

        System.out.println(map);

        Collection<Integer> val = map.values();

        Object[] arr = val.toArray();

        System.out.println(arr[0]);




    }
}
