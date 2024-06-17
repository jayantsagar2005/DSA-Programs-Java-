package LinkedList;

import java.util.Scanner;

public class FindValueLastIndex {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);
        Node i = new Node(90);
        Node j = new Node(100);
        Node k = new Node(110);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;

        Node ans = lastNode(a);
        System.out.println("Value is : "+ans.value);
    }

    public static Node lastNode(Node head) {
        Node slow = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the index value : ");
            int k = sc.nextInt();
            slow = head;
            Node fast = head;

            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return slow;
    }
}
