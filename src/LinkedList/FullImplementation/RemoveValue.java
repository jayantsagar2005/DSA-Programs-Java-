package LinkedList.FullImplementation;

import java.util.Scanner;

public class RemoveValue {
    public RemoveValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<><><> Remove Value List <><><>");
        System.out.println();
        System.out.println("Press 1 into Last Index");
        System.out.println("Press 2 into Start Index");
        System.out.println("Press 3 into Any Index");
        System.out.println("Press 0 into Back");
        System.out.print("Enter your choice : ");
        int n = sc.nextInt();
        System.out.println();

        if(n == 1){
            System.out.println("<><><> Value Remove Last Index <><><>");
            System.out.println();

            if(Controllor.getSize() == 0){
                System.out.println("Empty List !");
                return;
            }
            Node temp = Controllor.getHead();
            if(Controllor.getSize() == 1){
                Controllor.setHead(null);
                Controllor.setTail(null);
            }else{
                while (temp.next.next != null){
                    temp = temp.next;
                }
                temp.next = null;
                Controllor.setTail(temp);
            }
            Controllor.setSize(Controllor.getSize()-1);
            System.out.println("Value Remove !");
            new RemoveValue();

        } else if (n == 2) {
            System.out.println("<><><> Value Remove Start Index <><><>");
            System.out.println();

            if(Controllor.getSize() == 0){
                System.out.println("Empty List !");
                return;
            }

            if(Controllor.getSize() == 1){
                Controllor.setHead(null);
                Controllor.setTail(null);
            }else{
                Controllor.setHead(Controllor.getHead().next);
            }
            Controllor.setSize(Controllor.getSize()-1);
            System.out.println("Value Remove !");
            new RemoveValue();
        } else if (n == 3) {
            System.out.println("<><><> Value Remove Any Index <><><>");
            System.out.println();
            System.out.print("Enter the index : ");
            int idx = sc.nextInt();

            if(idx < 0 || idx >= Controllor.getSize()){
                System.out.println("Invalid Index !");
                System.out.println();
                return;
            }

            Node temp = Controllor.getHead();

            if(idx == 0 && Controllor.getSize() == 1){
                Controllor.setHead(null);
                Controllor.setTail(null);
            } else if (idx == 0) {
                Controllor.setHead(Controllor.getHead().next);
            } else if (idx == Controllor.getSize()-1) {
                for (int i=0; i<idx-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                Controllor.setTail(temp);
            } else{
                for (int i=0; i<idx-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }

            Controllor.setSize(Controllor.getSize()-1);
            System.out.println("Value Remove !");
            new RemoveValue();
        } else if (n == 0) {
            System.out.println("One step backed");
        }else {
            System.out.println("Wrong choice, try again !");
            new RemoveValue();
        }
    }
}
