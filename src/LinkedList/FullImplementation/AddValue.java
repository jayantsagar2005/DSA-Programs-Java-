package LinkedList.FullImplementation;

import java.util.Scanner;

public class AddValue {

    public AddValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<><><> Add Value List <><><>");
        System.out.println();
        System.out.println("Press 1 into Last Index");
        System.out.println("Press 2 into Start Index");
        System.out.println("Press 3 into Any Index");
        System.out.println("Press 0 into Back");
        System.out.print("Enter your choice : ");
        int n = sc.nextInt();
        System.out.println();

        if(n == 1){
            System.out.println("<><><> Value Add Last Index <><><>");
            System.out.println();
            System.out.print("Enter the value : ");
            int val = sc.nextInt();

            Node temp = new Node(val);

            if(Controllor.getHead() == null && Controllor.getTail() == null){
                Controllor.setHead(temp);
                Controllor.setTail(temp);
            }else {
                Controllor.getTail().next = temp;
                Controllor.setTail(temp);
            }
            Controllor.setSize(Controllor.getSize()+1);
            System.out.println("Value Added !");
            new AddValue();

        } else if (n == 2) {
            System.out.println("<><><> Value Add Start Index <><><>");
            System.out.println();
            System.out.print("Enter the value : ");
            int val = sc.nextInt();

            Node temp = new Node(val);

            if(Controllor.getHead() == null && Controllor.getTail() == null){
                Controllor.setHead(temp);
                Controllor.setTail(temp);
            }else {
                temp.next = Controllor.getHead();
                Controllor.setHead(temp);
            }
            Controllor.setSize(Controllor.getSize()+1);
            System.out.println("Value Added !");
            new AddValue();
        } else if (n == 3) {
            System.out.println("<><><> Value Add Any Index <><><>");
            System.out.println();
            System.out.print("Enter the value : ");
            int val = sc.nextInt();
            System.out.print("Enter the index : ");
            int idx = sc.nextInt();

            Node temp = new Node(val);

            if(idx < 0 || idx > Controllor.getSize()){
                System.out.println("Invalid Index !");
                System.out.println();
                return;
            }
            if(Controllor.getSize() == 0){
                Controllor.setHead(temp);
                Controllor.setTail(temp);
            } else if (Controllor.getSize() == idx) {
                Controllor.getTail().next = temp;
                Controllor.setTail(temp);
            } else if (idx == 0) {
                temp.next = Controllor.getHead();
                Controllor.setHead(temp);
            }else{
                Node t = Controllor.getHead();
                for (int i=0; i<idx-2; i++){
                    t = t.next;
                }
                temp.next = t.next;
                t.next = temp;
            }
            Controllor.setSize(Controllor.getSize()+1);
            System.out.println("Value Added !");
            new AddValue();
        } else if (n == 0) {
            System.out.println("One step backed");
        }else {
            System.out.println("Wrong choice, try again !");
            new AddValue();
        }
    }
}
