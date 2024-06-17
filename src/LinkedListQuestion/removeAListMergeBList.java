package LinkedListQuestion;

//You are given two linked lists: list1 and list2 of sizes n and m respectively.Remove list1 's nodes from the ath node to the bth node, and
// put list2 in their place. [Leetcode 1669]


public class removeAListMergeBList {
    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static Node removeAndMerge(Node list1, Node list2, int m, int n) {
        if(list1 == null || list1.next == null){
            return list1;
        }
        Node temp = list1;
        Node a = null;
        Node b = null;
        for (int i=0; i<=n; i++){
            if(i == m-1){
                a = temp;
            }
            if (i == n){
                b = temp.next;
            }
            temp = temp.next;
        }
        a.next = list2;
        Node t1 = list2;
        while(t1.next != null){
            t1 = t1.next;
        }
        t1.next = b;
        return list1;
    }
    public static void main(String[] args) {
        Node a1 = new Node(0);
        Node b1 = new Node(1);
        Node c1 = new Node(2);
        Node d1 = new Node(3);
        Node e1 = new Node(4);
        Node f1 = new Node(5);
        Node g1 = new Node(6);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next = f1;
        f1.next = g1;

        Node a2 = new Node(1000);
        Node b2 = new Node(1001);
        Node c2 = new Node(1002);
        Node d2 = new Node(1003);
        Node e2 = new Node(1004);
        a2.next = b2;
        b2.next = c2;
        c2.next = d2;
        d2.next = e2;

        Node ans = removeAndMerge(a1,a2,2,5);
        display(ans);

    }
}
