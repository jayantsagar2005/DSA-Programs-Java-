package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Display {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        for(int i=0; i<q.size(); i++){
            int val = q.remove();
            System.out.print(val+" ");
            q.add(val);
        }
    }
}
