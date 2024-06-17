package LinkedListQuestion;

//Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is
// 1-indexed). [Leetcode 1721]


public class swappingKValue {
    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static Node swapping(Node head, int k) {

        if(head == null || head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        for(int i=1; i<k; i++){
            fast = fast.next;
        }
        Node temp = fast;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        int val = temp.val;
        temp.val = slow.val;
        slow.val = val;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(9);
        Node c = new Node(6);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(3);
        Node i = new Node(0);
        Node j = new Node(9);
        Node k = new Node(5);
        a.next = b;
        b.next = c;
        c.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;

        Node ans = swapping(a,5);
        display(ans);
    }
}
