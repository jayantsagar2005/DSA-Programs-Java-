package LEETCODE_DSA;

public class reverse_ll {
    public static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseNode(Node head) {
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseNode(head.next);
        Node newNode = head.next;
        newNode.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println("Original LinkedList : ");
        display(a);

        Node head = reverseNode(a);

        System.out.println("Reverse LinkedList : ");
        display(head);
    }
}
