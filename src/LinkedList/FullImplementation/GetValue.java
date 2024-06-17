package LinkedList.FullImplementation;

import java.util.Scanner;

public class GetValue {
    public GetValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<><><> Get Value List <><><>");
        System.out.println();
        System.out.println("Press 1 into Last Index");
        System.out.println("Press 2 into Start Index");
        System.out.println("Press 3 into Any Index");
        System.out.println("Press 0 into Back");
        System.out.print("Enter your choice : ");
        int n = sc.nextInt();
        System.out.println();

        if(n == 1){
            System.out.println("<><><> Get Value Last Index <><><>");
            System.out.println();
            System.out.println("Last Index Value --> "+Controllor.getTail().value);
            new GetValue();
        } else if (n == 2) {
            System.out.println("<><><> Get Value Start Index <><><>");
            System.out.println();
            System.out.println("Start Index Value --> "+Controllor.getHead().value);
            new GetValue();
        } else if (n == 3) {
            System.out.println("<><><> Get Value Any Index <><><>");
            System.out.println();
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
            System.out.println("Your Index Value --> "+temp.value);
            new GetValue();
        } else if (n == 0) {
            System.out.println("One step backed");
        }else {
            System.out.println("Wrong choice, try again !");
            new GetValue();
        }
    }
}
