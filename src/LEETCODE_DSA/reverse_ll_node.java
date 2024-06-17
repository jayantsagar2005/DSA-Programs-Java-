package LEETCODE_DSA;

public class reverse_ll_node {

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
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
    public static Node reverseNode(Node head) {
        Node prev = null;
        while(head!=null){
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
