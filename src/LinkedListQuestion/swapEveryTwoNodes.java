package LinkedListQuestion;

public class swapEveryTwoNodes {

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static Node swapNode(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node temp1 = head;
        Node temp2 = head.next;

        while(temp2.next != null && temp2.next.next != null){
            int val = temp1.val;
            temp1.val = temp2.val;
            temp2.val = val;
            temp1 = temp1.next.next;
            temp2 = temp2.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node b1 = new Node(2);
        Node c1 = new Node(3);
        Node d1 = new Node(4);
        Node e1 = new Node(5);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;

        Node ans = swapNode(a1);
        display(ans);
    }
}
