package LinkedList.FullImplementation;

import java.util.Scanner;

public class SetValue {
    public SetValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<><><> Set Value List <><><>");
        System.out.println();
        System.out.println("Press 1 into Last Index");
        System.out.println("Press 2 into Start Index");
        System.out.println("Press 3 into Any Index");
        System.out.println("Press 0 into Back");
        System.out.print("Enter your choice : ");
        int n = sc.nextInt();
        System.out.println();

        if(n == 1){
            System.out.println("<><><> Set Value Last Index <><><>");
            System.out.println();
            System.out.println("Enter the value : ");
            int val = sc.nextInt();
            Controllor.getTail().value = val;
            System.out.println("Value Updated !");
            new SetValue();
        } else if (n == 2) {
            System.out.println("<><><> Set Value Start Index <><><>");
            System.out.println();
            System.out.println("Enter the value : ");
            int val = sc.nextInt();
            Controllor.getHead().value = val;
            System.out.println("Value Updated !");
            new SetValue();
        } else if (n == 3) {
            System.out.println("<><><> Set Value Any Index <><><>");
            System.out.println();
            System.out.println("Enter the value : ");
            int val = sc.nextInt();
            System.out.print("Enter the index : ");
            int idx = sc.nextInt();
            if(idx < 0 || idx >= Controllor.getSize()){
                System.out.println("Invalid Index !");
                System.out.println();
                return;
            }
            Node temp = Controllor.getHead();
            for (int i=0; i<idx; i++){
                temp = temp.next;
            }
            temp.value = val;
            System.out.println("Value Updated !");
            new SetValue();
        } else if (n == 0) {
            System.out.println("One step backed");
        }else {
            System.out.println("Wrong choice, try again !");
            new SetValue();
        }
    }
}
