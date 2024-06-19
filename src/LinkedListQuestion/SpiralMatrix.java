package LinkedListQuestion;

public class SpiralMatrix {

    public static void spiralMatrixInsertElement(Node head, int[][] arr) {
        Node temp = head;
        int minR = 0;
        int maxR = arr.length-1;
        int minC = 0;
        int maxC = arr[0].length-1;

        while(temp != null){
            for (int i=minC; i<=maxC; i++){
                if (temp == null){
                    return;
                }
                arr[minR][i] = temp.val;
                temp = temp.next;
            }
            minR++;

            for (int i=minR; i<=maxR; i++){
                if (temp == null){
                    return;
                }
                arr[i][maxC] = temp.val;
                temp = temp.next;
            }
            maxC--;

            for (int i=maxC; i>=minC; i--){
                if (temp == null){
                    return;
                }
                arr[maxR][i] = temp.val;
                temp = temp.next;
            }
            maxR--;

            for (int i=maxR; i>=minR; i--){
                if (temp == null){
                    return;
                }
                arr[i][minC] = temp.val;
                temp = temp.next;
            }
            minC++;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(9);
        Node k = new Node(8);
        Node l = new Node(7);
        Node m = new Node(6);
        Node n = new Node(5);
        Node o = new Node(4);
        Node p = new Node(3);
        Node q = new Node(2);
        Node r = new Node(1);
        Node s = new Node(1);
        Node t = new Node(2);
        Node u = new Node(3);
        Node v = new Node(4);
        Node w = new Node(5);
        Node x = new Node(6);
        Node y = new Node(7);
        a.next = b; b.next = c; c.next = d; d.next = e;
        e.next = f; f.next = g; g.next = h; h.next = i;
        i.next = j; j.next = k; k.next = l; l.next = m;
        m.next = n; n.next = o; o.next = p; p.next = q;
        q.next = r; r.next = s; s.next = t; t.next = u;
        u.next = v; v.next = w; w.next = x; x.next = y;

        int[][] arr = new int[5][5];
        spiralMatrixInsertElement(a,arr);

        for (int i1=0; i1<arr.length; i1++){
            for (int j1=0; j1<arr[0].length; j1++){
                System.out.print(arr[i1][j1]+" ");
            }
            System.out.println();
        }

    }
}
