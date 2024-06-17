package LinkedList;

public class Insertion {

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.print("Print Loop :");
        print(node1);
        System.out.print("Print Recursively : ");
        printRec(node1);
    }

    public static void printRec(Node head) {
        if (head == null){
            return;
        }
        printRec(head.next);
        System.out.print(head.value+" ");
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
