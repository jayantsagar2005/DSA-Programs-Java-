package LinkedListQuestion;

//You are given the head of a linked list. Delete the middle node,and return the head of the modified linked list. [Leetcode 2095]


public class removeMiddleNode {

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static Node removeMidNde(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(1);
        Node f = new Node(2);
        Node g = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node ans = removeMidNde(a);
        display(ans);
    }
}
