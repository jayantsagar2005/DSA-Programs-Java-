package LinkedList.FullImplementation;

import java.util.Scanner;

public class Menu {
    public void menu() throws InterruptedException {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("<><><> Main Manu <><><>");
            System.out.println();
            System.out.println("Press 1 into Add Value List");
            System.out.println("Press 2 into Remove Value List");
            System.out.println("Press 3 into Get Value List");
            System.out.println("Press 4 into Set Value List");
            System.out.println("Press 5 into Size of List");
            System.out.println("Press 6 into Display List");
            System.out.println("Press 0 into Exit");
            System.out.print("Enter your choice : ");
            n = sc.nextInt();
            System.out.println();

            if(n == 1){
                new AddValue();
            } else if (n == 2) {
                new RemoveValue();
            } else if (n == 3) {
                new GetValue();
            }else if (n == 4) {
                new SetValue();
            } else if (n == 5) {
                new ListSize(Controllor.getSize());
            }else if (n == 6) {
                new Display(Controllor.getHead());
            } else if (n == 0) {
                System.out.print("Exit successfully");
                for (int i=0; i<3; i++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
            }else{
                System.out.println("Wrong choice,try again");
            }
        }while(n != 0);
    }
}
