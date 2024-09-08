package Hash.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class Inilization {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(20);
        set.add(50);
        set.add(20);

        System.out.println(set);
        System.out.println(set.size());

        System.out.println(set.contains(20));
        set.remove(20);
        System.out.println(set);

        Object[] arr = set.toArray();

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
