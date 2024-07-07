package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            int val = st.pop();
            System.out.print(val+" ");
            st1.push(val);
        }
        while (!st1.isEmpty()){
            int val = st1.pop();
            q.add(val);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        reverse(q);
        System.out.println();
        System.out.println(q.peek());
    }
}
