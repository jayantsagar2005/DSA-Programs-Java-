package LinkedListQuestion;

public class addTwoListValue {

    public static Node reverseList(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head.next;
        Node newHead = reverseList(temp);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static Node addTwoNumber(Node list1, Node list2) {
        Node ans = new Node(-1);
        Node temp = ans;

        int carry = 0;
        while(list1 != null && list2 != null){
            int n = list1.val + list2.val;
            n = n + carry;
            carry = n/10;
            Node node = new Node(n%10);
            temp.next = node;
            temp = temp.next;
            list1 = list1.next;
            list2 = list2.next;
        }

        while(list1 != null){
            int n = list1.val;
            n = n + carry;
            carry = n/10;
            Node node = new Node(n%10);
            temp.next = node;
            temp = temp.next;
            list1 = list1.next;
        }

        while(list2 != null){
            int n = list2.val;
            n = n + carry;
            carry = n/10;
            Node node = new Node(n%10);
            temp.next = node;
            temp = temp.next;
            list2 = list2.next;
        }

        if(carry > 0){
            Node node = new Node(carry);
            temp.next = node;
        }

        return ans.next;
    }

    public static void main(String[] args) {
        Node a1 = new Node(7);
        Node b1 = new Node(2);
        Node c1 = new Node(4);
        Node d1 = new Node(3);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;

        Node a2 = new Node(5);
        Node b2 = new Node(6);
        Node c2 = new Node(4);
        a2.next = b2;
        b2.next = c2;

        Node list1 = reverseList(a1);
        Node list2 = reverseList(a2);
        Node ans = addTwoNumber(list1,list2);
        Node ans1 = reverseList(ans);
        display(ans1);
    }
}
